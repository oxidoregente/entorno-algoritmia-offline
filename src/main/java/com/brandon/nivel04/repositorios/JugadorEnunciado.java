package com.brandon.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * RETO: Ranking de Jugadores.
 * 
 * Implementa una consulta personalizada para obtener el Top de jugadores.
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
