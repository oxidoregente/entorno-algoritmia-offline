package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * SOLUCIÓN: Entidad Jugador.
 *
 * <p>Entidad JPA que modela un jugador con nickname y puntaje.
 * La tabla se llama {@code jugador_solucion} para evitar conflictos
 * con la entidad de ejercicio.</p>
 */
@Entity
@Table(name = "jugador_solucion")
public class JugadorSolucion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nickname;
    private Integer puntaje;

    public JugadorSolucion() {}
    public JugadorSolucion(String nickname, Integer puntaje) {
        this.nickname = nickname;
        this.puntaje = puntaje;
    }
    public Long getId() { return id; }
    public String getNickname() { return nickname; }
    public Integer getPuntaje() { return puntaje; }
}
