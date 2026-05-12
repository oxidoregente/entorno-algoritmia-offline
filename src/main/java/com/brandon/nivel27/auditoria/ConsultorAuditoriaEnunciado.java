package com.brandon.nivel27.auditoria;

import com.brandon.nivel04.repositorios.TransaccionEnunciado;
import org.springframework.stereotype.Service;

/**
 * RETO: Consultor de Auditoría.
 * 
 * Este nivel demuestra cómo Hibernate Envers crea automáticamente
 * tablas de auditoría (transaccion_enunciado_aud).
 * 
 * Tu tarea es entender cómo la anotación @Audited captura el historial.
 */
@Service
public class ConsultorAuditoriaEnunciado {

    public void verificarHistorial(TransaccionEnunciado transaccion) {
        // TODO: Simular la consulta de revisiones pasadas
        System.out.println(">> [AUDITORÍA] Verificando historial para ID: " + transaccion.getId());
    }
}
