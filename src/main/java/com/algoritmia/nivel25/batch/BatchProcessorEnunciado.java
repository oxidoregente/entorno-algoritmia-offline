package com.algoritmia.nivel25.batch;

import org.springframework.batch.item.ItemProcessor;

/**
 * 🎓 RETO: Procesador de Ítems (ItemProcessor).
 * <b>Dificultad: Media</b>
 *
 * <p>Spring Batch divide el trabajo en tres etapas: <b>Reader</b> (lee de una
 * fuente), <b>Processor</b> (transforma o filtra) y <b>Writer</b> (persiste).
 * El Processor es el lugar ideal para limpiar datos, enriquecerlos o filtrar
 * registros no válidos. Si devuelve <code>null</code>, el item se omite y no
 * llega al Writer.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Implementa <code>ItemProcessor&lt;I, O&gt;</code> donde <code>I</code> es el tipo de entrada y <code>O</code> el de salida.</li>
 *   <li>Devolver <code>null</code> en <code>process()</code> excluye el item del batch.</li>
 *   <li>El procesador se enchufa a un <code>Step</code> en su <code>SimpleStepBuilder</code>.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * stepBuilder.&lt;String, String&gt;chunk(10)
 *     .reader(...)
 *     .processor(new BatchProcessorEnunciado())
 *     .writer(...);
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Usa <code>item == null || item.isBlank()</code> para detectar vacíos y retornar <code>null</code>.</li>
 *   <li>Aplica <code>item.trim().toUpperCase()</code> para limpiar y normalizar.</li>
 * </ul>
 */
public class BatchProcessorEnunciado implements ItemProcessor<String, String> {

    /**
     * Limpia y normaliza cada item recibido del reader.
     *
     * @param item Valor original leído por el reader.
     * @return Item en mayúsculas y sin espacios, o {@code null} si debe omitirse.
     */
    @Override
    public String process(String item) {
        // TODO: Transforma el item a mayúsculas y quita espacios en blanco.
        // Si el item es nulo o vacío, retorna null para ignorarlo.
        return null;
    }
}
