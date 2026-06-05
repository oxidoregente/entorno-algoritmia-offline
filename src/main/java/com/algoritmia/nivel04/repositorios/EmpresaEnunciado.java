package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * 🎓 RETO: Entidad Empresa con atributo embebido (@Embedded).
 * <b>Dificultad: Media</b>
 *
 * <p>Modela una empresa que contiene un objeto {@link DireccionEnunciado}
 * embebido (no es una entidad propia, sus columnas se aplanan dentro de la
 * tabla {@code empresa}). Patrón típico en directorios de empresas o backends
 * de facturación, donde la dirección no tiene identidad propia.</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>{@code DireccionEnunciado} se marca con {@link Embeddable} y contiene {@code calle} y {@code ciudad}.</li>
 *   <li>{@link EmpresaEnunciado} la incluye con {@link Embedded} → ambas columnas viven en la misma tabla.</li>
 *   <li>{@code id}: clave primaria autogenerada.</li>
 *   <li>El repositorio asociado deberá buscar empresas por la ciudad embebida usando la sintaxis {@code findByDireccionCiudad(...)}.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * DireccionEnunciado dir = new DireccionEnunciado("Gran Vía 1", "Madrid");
 * EmpresaEnunciado e   = new EmpresaEnunciado("ACME", dir);
 * repository.save(e);
 *
 * // Tabla resultante (aplanada):
 * // | id | nombre | calle      | ciudad |
 * // |  1 | ACME   | Gran Vía 1 | Madrid |
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>No anotes {@code DireccionEnunciado} con {@code @Entity}: usa {@code @Embeddable}.</li>
 *   <li>Spring Data permite navegar atributos embebidos con notación de punto: {@code DireccionCiudad}.</li>
 * </ul>
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
