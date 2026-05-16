package com.algoritmia.nivel13.cache;

import org.springframework.cache.annotation.CacheEvict;

/**
 * 🏆 SOLUCIONES: Invalidación, Condicional y Put.
 */
public class CacheExtraSoluciones {

    // Invalidación
    @CacheEvict(cacheNames = "perfiles", key = "#email")
    public void actualizarPerfil(String email) {}

    @CacheEvict(cacheNames = "perfiles", allEntries = true)
    public void limpiarTodo() {}

    // Condicional
    /*
    @Cacheable(cacheNames = "datos", condition = "#cachear == true")
    public String obtenerDato(String id, boolean cachear) { ... }

    @Cacheable(cacheNames = "datos", unless = "#result.length() < 10")
    public String obtenerDatoLargo(String id) { ... }
    */

    // Cache Put
    /*
    @CachePut(cacheNames = "usuarios", key = "#id")
    public String actualizarNombre(String id, String nuevoNombre) { return nuevoNombre; }
    */
}
