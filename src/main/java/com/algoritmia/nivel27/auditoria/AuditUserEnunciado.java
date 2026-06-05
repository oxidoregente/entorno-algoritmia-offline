package com.algoritmia.nivel27.auditoria;

import org.hibernate.envers.AuditReader;
import org.hibernate.envers.AuditReaderFactory;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Auditoría de Usuario (RevisionListener).
 * <b>Dificultad: Media</b>
 *
 * <p>Saber qué cambió está bien, pero en sistemas reales necesitas saber
 * <b>quién</b> lo cambió. Envers permite inyectar un <code>RevisionListener</code>
 * que se invoca en cada nueva revisión para enriquecerla con datos extra
 * (usuario, IP, timestamp). Es el lugar perfecto para leer el
 * <code>SecurityContextHolder</code> y guardar el nombre del usuario actual.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Define una entidad <code>DefaultRevisionEntity</code> extendida con un campo <code>usuario</code>.</li>
 *   <li>Implementa <code>RevisionListener</code> y anota con <code>@EntityListeners</code> en la entidad revisada.</li>
 *   <li>En <code>newRevision()</code>, obtén el usuario con <code>SecurityContextHolder.getContext().getAuthentication()</code>.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * public class AuditRevisionListener implements RevisionListener {
 *     public void newRevision(Object revisionEntity) {
 *         MyRevisionEntity rev = (MyRevisionEntity) revisionEntity;
 *         rev.setUsuario(SecurityContextHolder.getContext().getAuthentication().getName());
 *     }
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El listener debe estar registrado con <code>@RevisionEntity</code> o <code>@EntityListeners</code>.</li>
 *   <li>Lee el usuario con <code>SecurityContextHolder.getContext().getAuthentication().getName()</code>.</li>
 * </ul>
 */
@Service
public class AuditUserEnunciado {

    /**
     * Configura el mecanismo para que Envers guarde el usuario que realiza cada cambio.
     */
    public void configurarAuditoriaUsuario() {
        // TODO: ¿Cómo le indicas a Envers que use el nombre del
        // usuario de Spring Security en cada revisión?
        // Pista: Implementa RevisionListener.
    }
}
