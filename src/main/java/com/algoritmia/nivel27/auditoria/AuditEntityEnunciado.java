package com.algoritmia.nivel27.auditoria;

import org.hibernate.envers.Audited;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * 🎓 RETO: Entidades Auditadas con Envers.
 * <b>Dificultad: Fácil</b>
 * 
 * <p>Para que Hibernate Envers empiece a trackear los cambios en una 
 * entidad, solo necesitas una anotación.</p>
 */
@Entity
@Audited
public class AuditEntityEnunciado {
    @Id
    private Long id;
    
    // TODO: Añade un campo 'nombre' y 'descripcion'. 
    // Verifica que se creen las tablas _AUD en la DB.
}
