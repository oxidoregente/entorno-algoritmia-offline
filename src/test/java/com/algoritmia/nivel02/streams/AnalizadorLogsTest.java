package com.algoritmia.nivel02.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.Test;

class AnalizadorLogsTest {

    @Test
    void testConteoLogs() {
        List<String> logs = List.of(
            "2024-05-12 [INFO] Started",
            "2024-05-12 [ERROR] Timeout",
            "2024-05-12 [INFO] Processing",
            "2024-05-12 [ERROR] Crash"
        );
        AnalizadorLogsEnunciado analizador = new AnalizadorLogsEnunciado();
        assertEquals(2, analizador.contarLogsPorNivel(logs, "ERROR"));
    }
}
