package com.algoritmia.nivel09;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DockerTest {

    @Test
    void testDockerBasico() {
        DockerBasicoEnunciado enunciado = new DockerBasicoEnunciado();
        String dockerfile = enunciado.generarDockerfile();
        
        assertNotNull(dockerfile);
        assertTrue(dockerfile.contains("FROM"), "Falta instrucción FROM");
        assertTrue(dockerfile.contains("openjdk:21") || dockerfile.contains("temurin:21"), 
            "Debe usar una imagen de Java 21");
        assertTrue(dockerfile.contains("COPY"), "Falta instrucción COPY");
        assertTrue(dockerfile.contains("ENTRYPOINT") || dockerfile.contains("CMD"), 
            "Falta comando de entrada");
    }

    @Test
    void testDockerMultiStage() {
        DockerMultiStageEnunciado enunciado = new DockerMultiStageEnunciado();
        String dockerfile = enunciado.generarDockerfile();
        
        assertNotNull(dockerfile);
        assertTrue(dockerfile.contains("AS build"), "Falta etiqueta de etapa build");
        assertTrue(dockerfile.contains("--from=build"), "Falta copia desde la etapa de build");
    }
}
