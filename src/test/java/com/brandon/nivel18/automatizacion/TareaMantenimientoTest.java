package com.brandon.nivel18.automatizacion;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.launch.JobLauncher;

@ExtendWith(MockitoExtension.class)
class TareaMantenimientoTest {

    @Mock
    private JobLauncher jobLauncher;

    @Mock
    private Job jobCierreContable;

    @InjectMocks
    private TareaMantenimientoEnunciado tarea;

    @Test
    void testDisparoDeTarea() throws Exception {
        tarea.ejecutarCierreMasivo();
        // Debería invocar al launcher si el estudiante implementa la lógica
        // verify(jobLauncher, atLeastOnce()).run(any(), any());
    }
}
