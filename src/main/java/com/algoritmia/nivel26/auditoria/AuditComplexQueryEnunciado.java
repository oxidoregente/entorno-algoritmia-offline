package com.algoritmia.nivel26.auditoria;

import org.hibernate.envers.query.AuditEntity;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.envers.AuditReader;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 🎓 RETO: Consultas de Auditoría Complejas.
 * <b>Dificultad: Difícil</b>
 *
 * <p>En un sistema regulado (banca, salud, e-commerce) necesitas responder
 * preguntas como "¿qué cambios hizo el usuario X entre las fechas A y B?".
 * Hibernate Envers permite ejecutar estas consultas cruzadas sobre todas las
 * tablas <code>_AUD</code> usando la <code>AuditQuery</code> con
 * <code>AuditEntity</code> y restricciones sobre la entidad de revisión.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Usa <code>AuditReader.createQuery().forRevisionsOfEntity(...)</code> para iterar revisiones.</li>
 *   <li>Aplica <code>AuditEntity.revisionProperty("usuario").eq(usuario)</code> para filtrar por autor.</li>
 *   <li>También puedes usar <code>AuditEntity.revisionType().eq(ADD/MOD/DEL)</code> para tipo de cambio.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * AuditQuery query = reader.createQuery()
 *     .forRevisionsOfEntity(MiEntidad.class, false, true)
 *     .add(AuditEntity.revisionProperty("usuario").eq(usuario));
 * List&lt;Object[]&gt; resultados = query.getResultList();
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Pasa <code>true</code> como segundo argumento de <code>forRevisionsOfEntity</code> para incluir deleciones.</li>
 *   <li>Añade el filtro con <code>AuditEntity.revisionProperty("usuario").eq(usuario)</code>.</li>
 * </ul>
 */
@Service
public class AuditComplexQueryEnunciado {

    /**
     * Busca todas las revisiones de cualquier entidad realizadas por un usuario concreto.
     *
     * @param reader <code>AuditReader</code> de Hibernate Envers para lanzar la consulta.
     * @param usuario Nombre del usuario cuyas modificaciones se quieren recuperar.
     * @return Lista de revisiones encontradas, o {@code null} si la implementación no está lista.
     */
    public List<?> buscarModificaciones(AuditReader reader, String usuario) {
        // TODO: Crea una AuditQuery que busque revisiones donde
        // el usuario sea el indicado.
        return null;
    }
}
