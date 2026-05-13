package com.algoritmia.nivel27.auditoria;

import com.algoritmia.nivel04.repositorios.TransaccionEnunciado;

/**
 * SOLUCIÓN: Consultor de Auditoría.
 */
public class ConsultorAuditoriaSolucion {

    public void verificarHistorial(TransaccionEnunciado transaccion) {
        // En un entorno real usaríamos AuditReaderFactory.get(entityManager)
        System.out.println(">> [AUDITORÍA] Historial recuperado. Versión actual: " + transaccion.getEstado());
    }
}
