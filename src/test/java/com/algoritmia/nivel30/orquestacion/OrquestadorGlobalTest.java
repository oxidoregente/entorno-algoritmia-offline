package com.algoritmia.nivel30.orquestacion;

import static org.mockito.Mockito.*;
import com.algoritmia.nivel04.repositorios.TransaccionEnunciado;
import com.algoritmia.nivel04.repositorios.TransaccionRepositoryEnunciado;
import com.algoritmia.nivel13.cache.GestorPerfilCacheEnunciado;
import com.algoritmia.nivel14.mensajeria.ProductorMensajesEnunciado;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
class OrquestadorGlobalTest {

    @Mock private TransaccionRepositoryEnunciado repository;
    @Mock private GestorPerfilCacheEnunciado cache;
    @Mock private ProductorMensajesEnunciado productor;

    @InjectMocks
    private OrquestadorGlobalEnunciado orquestador;

    @Test
    void testFlujoCompleto() {
        TransaccionEnunciado t = new TransaccionEnunciado("OK", 100.0);
        when(cache.obtenerPerfil("1")).thenReturn(null); // No está en caché
        when(repository.findById(1L)).thenReturn(Optional.of(t));

        orquestador.procesarConsultaMaestra(1L);

        // Debería guardarse en caché y notificarse
        // verify(cache).guardarPerfil(eq("1"), any());
        // verify(productor).enviarEvento(anyString());
    }
}
