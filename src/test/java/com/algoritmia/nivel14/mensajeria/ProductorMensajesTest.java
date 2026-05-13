package com.algoritmia.nivel14.mensajeria;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

@ExtendWith(MockitoExtension.class)
class ProductorMensajesTest {

    @Mock
    private RabbitTemplate rabbitTemplate;

    @InjectMocks
    private ProductorMensajesEnunciado productor;

    @Test
    void testEnvioEvento() {
        productor.enviarEvento("Test");
        // Debería invocar al template si el estudiante implementa la lógica
        // verify(rabbitTemplate, times(1)).convertAndSend(anyString(), anyString());
    }
}
