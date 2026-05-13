package com.brandon.nivel32.seguridad;

import static org.mockito.Mockito.*;
import com.brandon.nivel04.repositorios.LogAccesoEnunciado;
import com.brandon.nivel04.repositorios.LogAccesoRepositoryEnunciado;
import com.brandon.nivel20.notificaciones.ServicioEmailEnunciado;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.time.LocalDateTime;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class DetectorIntrusosTest {

    @Mock private LogAccesoRepositoryEnunciado repository;
    @Mock private ServicioEmailEnunciado emailService;

    @InjectMocks
    private DetectorIntrusosEnunciado detector;

    @Test
    void testDeteccionAmenaza() {
        LogAccesoEnunciado l = new LogAccesoEnunciado("192.168.66.6", LocalDateTime.now());
        when(repository.findAll()).thenReturn(List.of(l, l, l, l));

        detector.analizarAmenazas();

        // Debería alertar si hay más de 3
        // verify(emailService).enviarNotificacionSimple(anyString(), anyString(), anyString());
    }
}
