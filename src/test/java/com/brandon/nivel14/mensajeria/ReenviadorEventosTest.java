package com.brandon.nivel14.mensajeria;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

@ExtendWith(MockitoExtension.class)
class ReenviadorEventosTest {

    @Mock
    private RabbitTemplate rabbitTemplate;

    @InjectMocks
    private ReenviadorEventosEnunciado reenviador;

    @Test
    void testReenvioCorrecto() {
        reenviador.procesarYReenviar("Hola");
        
        // Verificamos que se llamó al reenvío con el formato esperado
        // verify(rabbitTemplate).convertAndSend(eq(ConfiguracionRabbit.COLA_AUDITORIA), contains("PROCESADO"));
    }
}
