package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * SOLUCIÓN: Entidad Empresa.
 *
 * <p>Entidad JPA que modela una empresa con nombre y dirección embebida
 * ({@link Embedded}). La tabla se llama {@code empresa_solucion}
 * para evitar conflictos con la entidad de ejercicio.</p>
 */
@Entity
@Table(name = "empresa_solucion")
public class EmpresaSolucion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @Embedded
    private DireccionEnunciado direccion;

    public EmpresaSolucion() {}
    public EmpresaSolucion(String nombre, DireccionEnunciado direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
}
