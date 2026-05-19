package com.algoritmia.nivel18.automatizacion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * Test para ejercicio de Backup Diario.
 * Valida ejecución de backups programados.
 */
class BackupDiarioTest {

    @Test
    void testManualTrigger() {
        BackupDiarioEnunciado backup = new BackupDiarioEnunciado();
        assertDoesNotThrow(() -> backup.realizarBackup());
    }
}
