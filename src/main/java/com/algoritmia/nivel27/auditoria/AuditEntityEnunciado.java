package com.algoritmia.nivel27.auditoria;

import org.hibernate.envers.Audited;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * 🎓 RETO: Entidades Auditadas con Envers.
 * <b>Dificultad: Fácil</b>
 *
 * <p>En muchos sistemas es imprescindible saber quién modificó un registro y
 * cuándo. Hibernate Envers añade esta funcionalidad de forma casi
 * transparente: basta con anotar la entidad con <code>@Audited</code> y Envers
 * generará automáticamente una tabla <code>_AUD</code> con el histórico de
 * cambios (insert, update, delete).</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Anota la clase con <code>@Entity</code> y <code>@Audited</code> (de <code>org.hibernate.envers</code>).</li>
 *   <li>Envers crea automáticamente una tabla espejo con sufijo <code>_AUD</code> por cada entidad auditada.</li>
 *   <li>Los campos no anotados con <code>@NotAudited</code> se incluyen en el histórico.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * # Tablas generadas automáticamente
 * cliente_enunciado
 * cliente_enunciado_aud
 * cliente_enunciado_aud_rev (revisiones)
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Añade los campos <code>nombre</code> y <code>descripcion</code> como <code>String</code> privados.</li>
 *   <li>Genera getters y setters para que Envers pueda leer/escribir los snapshots.</li>
 * </ul>
 */
@Entity
@Audited
public class AuditEntityEnunciado {
    @Id
    private Long id;

    // TODO: Añade un campo 'nombre' y 'descripcion'.
    // Verifica que se creen las tablas _AUD en la DB.
}
