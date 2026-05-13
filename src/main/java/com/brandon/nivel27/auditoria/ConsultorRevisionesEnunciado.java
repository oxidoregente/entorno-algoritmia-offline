package com.brandon.nivel27.auditoria;

import org.springframework.stereotype.Service;
import jakarta.persistence.EntityManager;
import java.util.List;

/**
 * 🎓 RETO: Consulta Histórica de Revisiones.
 * <b>Dificultad: Difícil</b>
 * 
 * <p>Implementa un servicio que recupere todas las versiones pasadas 
 * de una transacción específica usando el AuditReader de Hibernate Envers.</p>
 */
@Service
public class ConsultorRevisionesEnunciado {

    private final EntityManager entityManager;

    public ConsultorRevisionesEnunciado(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<?> obtenerTodasLasVersiones(Long transaccionId) {
        // TODO: Usa AuditReaderFactory.get(entityManager)
        // TODO: Realiza una consulta forRevisionsOfEntity
        return null;
    }
}
