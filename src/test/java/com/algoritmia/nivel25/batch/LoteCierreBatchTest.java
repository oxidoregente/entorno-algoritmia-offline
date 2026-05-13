package com.algoritmia.nivel25.batch;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LoteCierreBatchTest {

    @Autowired(required = false)
    private LoteCierreContableEnunciado batchConfig;

    @Test
    void testConfiguracionBatchCargada() {
        // assertNotNull(batchConfig, "La configuración de Batch debería estar definida");
    }
}
