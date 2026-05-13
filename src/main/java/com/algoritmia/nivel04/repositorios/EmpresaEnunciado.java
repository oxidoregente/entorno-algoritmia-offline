package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * RETO: Búsqueda por Atributos Embebidos.
 * 
 * Implementa una entidad 'Empresa' que tenga una '@Embedded' direccion.
 * El estudiante debe definir el Query Method para buscar empresas por Ciudad.
 */
@Embeddable
class DireccionEnunciado {
    private String calle;
    private String ciudad;

    public DireccionEnunciado() {}
    public DireccionEnunciado(String calle, String ciudad) {
        this.calle = calle;
        this.ciudad = ciudad;
    }
    public String getCiudad() { return ciudad; }
}

@Entity
public class EmpresaEnunciado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @Embedded
    private DireccionEnunciado direccion;

    public EmpresaEnunciado() {}
    public EmpresaEnunciado(String nombre, DireccionEnunciado direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
}
