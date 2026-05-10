package com.brandon.nivel4.repositorios;

import jakarta.persistence.*;

/**
 * Nivel 4: Persistencia con Spring Data JPA.
 * 
 * Entidad: CartaTarot.
 * Representa una carta en un mazo de Tarot para una aplicación de esoterismo local.
 */
@Entity
@Table(name = "cartas_tarot")
public class CartaTarot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    
    @Enumerated(EnumType.STRING)
    private Arcano arcano;
    
    private String significado;

    public enum Arcano {
        MAYOR, MENOR
    }

    public CartaTarot() {}

    public CartaTarot(String nombre, Arcano arcano, String significado) {
        this.nombre = nombre;
        this.arcano = arcano;
        this.significado = significado;
    }

    // Getters
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public Arcano getArcano() { return arcano; }
    public String getSignificado() { return significado; }
}
