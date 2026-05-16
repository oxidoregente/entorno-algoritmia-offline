package com.algoritmia.nivel27.auditoria;

import org.hibernate.envers.AuditReader;
import org.hibernate.envers.query.AuditEntity;
import java.util.List;

/**
 * 🏆 SOLUCIONES: Envers (User & Complex Query).
 */
public class AuditExtraSoluciones {

    // Auditoría de Usuario
    /*
    public class MyRevisionListener implements RevisionListener {
        @Override
        public void newRevision(Object revisionEntity) {
            MyRevisionEntity rev = (MyRevisionEntity) revisionEntity;
            rev.setUsuario(SecurityContextHolder.getContext().getAuthentication().getName());
        }
    }
    */

    public List<?> buscarModificaciones(AuditReader reader, String usuario) {
        return reader.createQuery()
                .forRevisionsOfEntity(AuditEntityEnunciado.class, false, true)
                .add(AuditEntity.revisionProperty("usuario").eq(usuario))
                .getResultList();
    }
}
