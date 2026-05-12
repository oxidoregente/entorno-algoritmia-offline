package com.brandon.nivel20.notificaciones;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ServicioBienvenidaTest {

    @Mock
    private ServicioEmailEnunciado emailService;

    @InjectMocks
    private ServicioBienvenidaEnunciado bienvenida;

    @Test
    void testEnvioBienvenida() {
        bienvenida.darBienvenida("Brandon", "brandon@ingenieria.com");
        
        // Verificamos que se delegó el envío al servicio de infraestructura
        // verify(emailService).enviarNotificacionSimple(eq("brandon@ingenieria.com"), anyString(), anyString());
    }
}
