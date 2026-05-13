package com.algoritmia.nivel20.notificaciones;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class AlertaSaldoBajoTest {

    @Mock
    private ServicioEmailEnunciado emailService;

    @InjectMocks
    private AlertaSaldoBajoEnunciado alerta;

    @Test
    void testAlertaSaldoCritico() {
        alerta.verificarYNotificar("UsuarioPrueba", "brandon@test.com", 5.0);
        
        // Solo debería enviarse si es menor a 10
        // verify(emailService).enviarNotificacionSimple(anyString(), anyString(), anyString());
    }

    @Test
    void testSinAlertaSaldoOk() {
        alerta.verificarYNotificar("UsuarioPrueba", "brandon@test.com", 100.0);
        
        // No debería enviarse nada
        verifyNoInteractions(emailService);
    }
}
