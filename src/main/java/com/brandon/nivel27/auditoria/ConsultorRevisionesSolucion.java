package com.brandon.nivel27.auditoria;

import com.brandon.nivel04.repositorios.TransaccionEnunciado;
import org.hibernate.envers.AuditReader;
import org.hibernate.envers.AuditReaderFactory;
import jakarta.persistence.EntityManager;
import java.util.List;

/**
 * 🏆 SOLUCIÓN: Consulta Histórica de Revisiones.
 */
public class ConsultorRevisionesSolucion {

    private final EntityManager entityManager;

    public ConsultorRevisionesSolucion(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<?> obtenerTodasLasVersiones(Long transaccionId) {
        AuditReader reader = AuditReaderFactory.get(entityManager);
        return reader.createQuery()
                .forRevisionsOfEntity(TransaccionEnunciado.class, true, true)
                .getResultList();
    }
}
