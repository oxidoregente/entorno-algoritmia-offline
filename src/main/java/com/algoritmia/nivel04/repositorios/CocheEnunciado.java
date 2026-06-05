package com.algoritmia.nivel04.repositorios;

import jakarta.persistence.*;

/**
 * 🎓 RETO: Entidad Coche.
 * <b>Dificultad: Fácil</b>
 *
 * <p>Modela un coche con marca y modelo, típico de un sistema de
 * concesionario, alquiler de vehículos o catálogo de segunda mano.
 * El repositorio asociado contará cuántas unidades hay de cada marca.</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>{@code id}: clave primaria autogenerada ({@link GenerationType#IDENTITY}).</li>
 *   <li>{@code marca}: fabricante del coche (p. ej. "Toyota", "Seat").</li>
 *   <li>{@code modelo}: nombre del modelo (p. ej. "Corolla", "Ibiza").</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * repository.save(new CocheEnunciado("Toyota", "Corolla"));
 * repository.save(new CocheEnunciado("Toyota", "Yaris"));
 * repository.save(new CocheEnunciado("Seat",   "Ibiza"));
 *
 * long toyotas = repository.countByMarca("Toyota"); // -&gt; 2
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>No se exponen getters: la entidad se usa como contenedor de persistencia.</li>
 *   <li>El constructor sin argumentos es obligatorio para JPA.</li>
 * </ul>
 */
@Entity
public class CocheEnunciado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;

    public CocheEnunciado() {}
    public CocheEnunciado(String marca, String modelo) { this.marca = marca; this.modelo = modelo; }
}
