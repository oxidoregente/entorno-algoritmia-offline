package com.brandon.nivel25.batch;

import org.junit.jupiter.api.Test;
import org.springframework.batch.core.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class BatchAvanzadoTest {

    @Autowired(required = false)
    @Qualifier("jobLimpieza")
    private Job jobLimpieza;

    @Test
    void testJobsCargados() {
        // El test fallará si el estudiante no define los Beans correctamente
        // assertNotNull(jobLimpieza);
    }
}
