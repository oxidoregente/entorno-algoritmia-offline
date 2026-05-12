package com.brandon.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * 🎓 RETO: Repositorio de Coches.
 * <b>Dificultad: Fácil</b>
 * 
 * <p>Implementa un Query Method para CONTAR cuántos coches hay de una marca específica.</p>
 */
@Entity
public class CocheEnunciado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;

    public CocheEnunciado() {}
    public CocheEnunciado(String marca, String modelo) { this.marca = marca; this.modelo = modelo; }
}
