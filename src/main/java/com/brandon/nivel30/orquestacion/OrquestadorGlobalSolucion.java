package com.brandon.nivel30.orquestacion;

import com.brandon.nivel04.repositorios.TransaccionEnunciado;
import com.brandon.nivel04.repositorios.TransaccionRepositoryEnunciado;
import com.brandon.nivel13.cache.GestorPerfilCacheEnunciado;
import com.brandon.nivel14.mensajeria.ProductorMensajesEnunciado;

/**
 * 🏆 SOLUCIÓN: Orquestador Global.
 */
public class OrquestadorGlobalSolucion {

    private final TransaccionRepositoryEnunciado repository;
    private final GestorPerfilCacheEnunciado cache;
    private final ProductorMensajesEnunciado productor;

    public OrquestadorGlobalSolucion(TransaccionRepositoryEnunciado repository, 
                                     GestorPerfilCacheEnunciado cache, 
                                     ProductorMensajesEnunciado productor) {
        this.repository = repository;
        this.cache = cache;
        this.productor = productor;
    }

    public TransaccionEnunciado procesarConsultaMaestra(Long id) {
        // 1. Consultar Caché
        TransaccionEnunciado t = (TransaccionEnunciado) cache.obtenerPerfil(id.toString());
        
        if (t == null) {
            // 2. Consultar BD
            t = repository.findById(id).orElseThrow(() -> new RuntimeException("No existe"));
            // 3. Poblar Caché
            cache.guardarPerfil(id.toString(), t);
        }

        // 4. Notificar Evento
        productor.enviarEvento("Consulta Maestra ejecutada para ID: " + id);

        return t;
    }
}
