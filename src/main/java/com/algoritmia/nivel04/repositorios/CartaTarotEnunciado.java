package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * 🎓 RETO: Entidad Carta de Tarot.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Modela una carta de tarot con nombre y tipo de arcano (MAYOR/MENOR).
 * El repositorio asociado deberá buscar cartas por tipo de arcano ordenadas por nombre.</p>
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
