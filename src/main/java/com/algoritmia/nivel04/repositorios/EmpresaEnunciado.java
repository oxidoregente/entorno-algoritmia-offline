package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * 🎓 RETO: Entidad Empresa con Atributo Embebido (@Embedded).
 * <b>Dificultad: Media</b>
 *
 * <p>Modela una empresa con una dirección embebida. El repositorio asociado deberá
 * buscar empresas por el nombre de la ciudad usando la sintaxis de atributos embebidos.</p>
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
