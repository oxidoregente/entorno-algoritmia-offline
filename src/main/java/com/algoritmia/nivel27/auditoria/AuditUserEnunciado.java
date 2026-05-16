package com.algoritmia.nivel27.auditoria;

import org.hibernate.envers.AuditReader;
import org.hibernate.envers.AuditReaderFactory;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Auditoría de Usuario (RevisionListener).
 * <b>Dificultad: Media</b>
 * 
 * <p>Aprende a capturar quién realizó el cambio (usuario actual) y 
 * guardarlo en la tabla de revisiones de Envers.</p>
 */
@Service
public class AuditUserEnunciado {
    
    public void configurarAuditoriaUsuario() {
        // TODO: ¿Cómo le indicas a Envers que use el nombre del 
        // usuario de Spring Security en cada revisión?
        // Pista: Implementa RevisionListener.
    }
}
