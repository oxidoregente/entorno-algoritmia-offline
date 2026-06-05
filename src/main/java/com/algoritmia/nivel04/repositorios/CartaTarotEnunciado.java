package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * 🎓 RETO: Entidad Carta de Tarot.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Modela una carta del mazo de tarot que será persistida en base de datos.
 * Se usa en aplicaciones de echadores de cartas online, juegos místicos o
 * catálogos de cartas para mostrar el mazo agrupado por tipo de arcano.</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>{@code id}: clave primaria autogenerada ({@link GenerationType#IDENTITY}).</li>
 *   <li>{@code nombre}: nombre de la carta (p. ej. "El Loco", "El Mago").</li>
 *   <li>{@code arcano}: enum con dos valores {@code MAYOR} o {@code MENOR}, persistido como {@code String}.</li>
 *   <li>La tabla se llama {@code cartas_tarot_enunciado} para no colisionar con la solución.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * CartaTarotEnunciado loco = new CartaTarotEnunciado("El Loco", Arcano.MAYOR);
 * repository.save(loco);
 *
 * // Tabla resultante:
 * // | id | nombre   | arcano |
 * // |  1 | El Loco  | MAYOR  |
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El enum {@code Arcano} se persiste como cadena gracias a {@link EnumType#STRING}.</li>
 *   <li>No añadas setters: la carta es prácticamente inmutable tras crearse.</li>
 * </ul>
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
