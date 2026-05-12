package com.brandon.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * RETO: Mazo de Tarot.
 * 
 * Modela una carta de tarot y su arcano.
 */
@Entity
@Table(name = "cartas_tarot_enunciado")
public class CartaTarotEnunciado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    
    @Enumerated(EnumType.STRING)
    private Arcano arcano;

    public enum Arcano { MAYOR, MENOR }

    public CartaTarotEnunciado() {}

    public CartaTarotEnunciado(String nombre, Arcano arcano) {
        this.nombre = nombre;
        this.arcano = arcano;
    }

    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public Arcano getArcano() { return arcano; }
}
