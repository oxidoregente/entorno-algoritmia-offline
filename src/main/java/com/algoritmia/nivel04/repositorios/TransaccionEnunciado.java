package com.algoritmia.nivel04.repositorios;

import org.hibernate.envers.Audited;
import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * 🎓 RETO: Entidad Transacción Financiera (con auditoría @Audited).
 * <b>Dificultad: Media</b>
 *
 * <p>Modela una transacción financiera (movimiento bancario, pago en
 * pasarela, transferencia interna...) con auditoría automática mediante
 * Hibernate Envers ({@link Audited}). Cada cambio en el estado o el monto se
 * guarda en una tabla de revisión paralela, lo que permite reconstruir el
 * historial completo y cumplir normativa financiera.</p>
 *
 * <p><b>Estructura / Reglas:</b></p>
 * <ul>
 *   <li>{@code id}: clave primaria autogenerada ({@link GenerationType#IDENTITY}).</li>
 *   <li>{@code estado}: cadena con el estado actual (p. ej. {@code "PENDIENTE"}, {@code "COMPLETADA"}, {@code "FALLIDA"}).</li>
 *   <li>{@code monto}: importe de la transacción ({@link Double}).</li>
 *   <li>{@code fecha}: se inicializa a {@link LocalDateTime#now()} en el constructor.</li>
 *   <li>Tiene setters para {@code estado} y {@code monto} (necesarios para que Envers detecte cambios).</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * TransaccionEnunciado t = new TransaccionEnunciado("PENDIENTE", 99.99);
 * repository.save(t);
 * t.setEstado("COMPLETADA");           // Envers crea una nueva revisión
 * repository.save(t);
 *
 * // findByEstado("COMPLETADA") -&gt; [t]
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>{@code @Audited} requiere la dependencia {@code hibernate-envers} en el pom.</li>
 *   <li>Hibernate generará automáticamente la tabla {@code transaccionenunciado_aud} para el historial.</li>
 * </ul>
 */
@Entity
@Audited
public class TransaccionEnunciado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String estado;
    private Double monto;
    private LocalDateTime fecha;

    public TransaccionEnunciado() {}

    public TransaccionEnunciado(String estado, Double monto) {
        this.estado = estado;
        this.monto = monto;
        this.fecha = LocalDateTime.now();
    }

    // Getters y Setters
    public Long getId() { return id; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public Double getMonto() { return monto; }
    public void setMonto(Double monto) { this.monto = monto; }
    public LocalDateTime getFecha() { return fecha; }
}
