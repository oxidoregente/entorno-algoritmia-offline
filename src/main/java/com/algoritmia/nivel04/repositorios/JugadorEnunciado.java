package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * 🎓 RETO: Entidad Jugador.
 * <b>Dificultad: Media</b>
 *
 * <p>Modela un jugador de una aplicación de videojuegos o gamificación.
 * Permite construir rankings (Top N) por puntaje, una operación clásica
 * en marcadores online y leaderboards.</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>{@code id}: clave primaria autogenerada ({@link GenerationType#IDENTITY}).</li>
 *   <li>{@code nickname}: alias del jugador (cadena libre).</li>
 *   <li>{@code puntaje}: marcador acumulado del jugador ({@link Integer}).</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * repository.save(new JugadorEnunciado("Neo",     1500));
 * repository.save(new JugadorEnunciado("Trinity", 1800));
 * repository.save(new JugadorEnunciado("Morpheo", 2000));
 *
 * // findTop3ByOrderByPuntajeDesc() -&gt; [Morpheo, Trinity, Neo]
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El constructor sin argumentos es obligatorio para JPA.</li>
 *   <li>Considera el {@code puntaje} como inmutable tras crear el jugador (sin setter).</li>
 * </ul>
 */
@Entity
public class JugadorEnunciado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nickname;
    private Integer puntaje;

    public JugadorEnunciado() {}

    public JugadorEnunciado(String nickname, Integer puntaje) {
        this.nickname = nickname;
        this.puntaje = puntaje;
    }

    public Long getId() { return id; }
    public String getNickname() { return nickname; }
    public Integer getPuntaje() { return puntaje; }
}
