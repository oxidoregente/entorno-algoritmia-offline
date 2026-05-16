package com.algoritmia.nivel27.auditoria;

import org.hibernate.envers.query.AuditEntity;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.envers.AuditReader;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 🎓 RETO: Consultas de Auditoría Complejas.
 * <b>Dificultad: Difícil</b>
 * 
 * <p>Aprende a buscar qué entidades fueron modificadas por un usuario 
 * específico en un rango de fechas determinado.</p>
 */
@Service
public class AuditComplexQueryEnunciado {

    public List<?> buscarModificaciones(AuditReader reader, String usuario) {
        // TODO: Crea una AuditQuery que busque revisiones donde 
        // el usuario sea el indicado.
        return null;
    }
}
