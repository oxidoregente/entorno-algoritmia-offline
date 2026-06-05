package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * 🎓 RETO: Entidad Cliente.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Modela un cliente básico dentro de un CRM o ecommerce. Se utiliza para
 * almacenar el catálogo de clientes en base de datos y poder buscarlos por
 * nombre desde la capa de servicios.</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>{@code id}: clave primaria autogenerada ({@link GenerationType#IDENTITY}).</li>
 *   <li>{@code nombre}: nombre del cliente (cadena libre).</li>
 *   <li>Solo se exponen el getter del id y del nombre (sin setters).</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * ClienteEnunciado c = new ClienteEnunciado("Ana");
 * repository.save(c);
 * // | id | nombre |
 * // |  1 | Ana    |
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>No hace falta {@code @Table}: JPA usará el nombre de la clase como tabla.</li>
 *   <li>Mantén el constructor sin argumentos: JPA lo necesita para hidratar la entidad.</li>
 * </ul>
 */
@Entity
public class ClienteEnunciado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    public ClienteEnunciado() {}
    public ClienteEnunciado(String nombre) { this.nombre = nombre; }
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
}
