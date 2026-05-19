package com.algoritmia.nivel11;

/**
 * 🎓 RETO: Testcontainers con Redis.
 * <b>Dificultad: Difícil</b>
 * 
 * <p>Configura un contenedor de Redis para validar la lógica de caché 
 * en un entorno real.</p>
 */
public class TestcontainersRedisEnunciado {
    /**
     * Obtiene las instrucciones para configurar un contenedor Redis
     * con Testcontainers para validar la lógica de caché.
     *
     * @return String con las instrucciones del reto
     */
    public String getInstrucciones() {
        return "Usa GenericContainer(\"redis:7-alpine\") y mapea el puerto 6379";
    }
}
