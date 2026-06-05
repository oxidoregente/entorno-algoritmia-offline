package com.algoritmia.nivel26.auditoria;

import com.algoritmia.nivel04.repositorios.TransaccionEnunciado;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Consultor de Auditoría.
 * <b>Dificultad: Media</b>
 *
 * <p>En una fintech, un cliente puede reclamar "yo no hice esa transferencia".
 * El equipo de soporte debe poder revisar todas las versiones pasadas de la
 * transacción (monto, fecha, cuenta destino) y mostrar al cliente el histórico
 * completo. Hibernate Envers lo permite gracias a las tablas
 * <code>_AUD</code> que se generan automáticamente.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Toda entidad anotada con <code>@Audited</code> genera una tabla espejo <code>_AUD</code>.</li>
 *   <li>Las revisiones se consultan con <code>AuditReader</code> y ofrecen metadatos (autor, fecha, tipo de cambio).</li>
 *   <li>Este consultor simula la consulta imprimiendo por consola el id de la transacción.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * # Tablas generadas
 * transaccion_enunciado
 * transaccion_enunciado_aud
 * revinfo (metadatos de revisión)
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El mensaje en consola ya valida que la entidad cuenta con un <code>getId()</code>.</li>
 *   <li>Para la versión real, sustituye el <code>System.out.println</code> por una <code>AuditQuery</code>.</li>
 * </ul>
 */
@Service
public class ConsultorAuditoriaEnunciado {

    /**
     * Simula la consulta del historial de revisiones de una transacción.
     *
     * @param transaccion Transacción sobre la cual verificar el historial.
     */
    public void verificarHistorial(TransaccionEnunciado transaccion) {
        // TODO: Simular la consulta de revisiones pasadas
        System.out.println(">> [AUDITORÍA] Verificando historial para ID: " + transaccion.getId());
    }
}
