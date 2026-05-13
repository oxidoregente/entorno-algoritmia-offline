package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * SOLUCIÓN: Mazo de Tarot.
 */
@Entity
@Table(name = "cartas_tarot_solucion")
public class CartaTarotSolucion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Enumerated(EnumType.STRING)
    private Arcano arcano;

    public enum Arcano { MAYOR, MENOR }

    public CartaTarotSolucion() {}

    public CartaTarotSolucion(String nombre, Arcano arcano) {
        this.nombre = nombre;
        this.arcano = arcano;
    }

    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public Arcano getArcano() { return arcano; }
}
