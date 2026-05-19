package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * SOLUCIÓN: Entidad Coche.
 *
 * <p>Entidad JPA que modela un coche con marca y modelo.
 * La tabla se llama {@code coche_solucion} para evitar conflictos
 * con la entidad de ejercicio.</p>
 */
@Entity
@Table(name = "coche_solucion")
public class CocheSolucion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;

    public CocheSolucion() {}
    public CocheSolucion(String marca, String modelo) { this.marca = marca; this.modelo = modelo; }
    public Long getId() { return id; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
}
