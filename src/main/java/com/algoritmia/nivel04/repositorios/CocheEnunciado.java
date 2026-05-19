package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * 🎓 RETO: Entidad Coche.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Modela un coche con marca y modelo. El repositorio asociado deberá contar
 * cuántos coches existen de una marca específica.</p>
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
