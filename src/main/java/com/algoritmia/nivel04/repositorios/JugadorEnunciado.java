package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * 🎓 RETO: Entidad Jugador.
 * <b>Dificultad: Media</b>
 *
 * <p>Modela un jugador con nickname y puntaje. El repositorio asociado deberá
 * implementar una consulta personalizada para obtener el Top 3 de jugadores con mayor puntaje.</p>
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
