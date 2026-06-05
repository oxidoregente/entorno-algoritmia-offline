package com.algoritmia.nivel24.batch;

import com.algoritmia.nivel04.repositorios.ClienteEnunciado;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * 🎓 RETO: Importador de Clientes (Simulado).
 * <b>Dificultad: Media</b>
 *
 * <p>En una migración o importación masiva, los datos suelen llegar "sucios":
 * con espacios sobrantes, mezclas de mayúsculas/minúsculas, duplicados
 * visuales, etc. Este Job Batch limpia y normaliza los nombres de los clientes
 * antes de persistirlos, garantizando consistencia en la base de datos.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>El <code>ItemProcessor</code> se define como <code>@Bean</code> dentro de una clase <code>@Configuration</code>.</li>
 *   <li>El processor se enchufa al step con <code>.processor(...)</code>.</li>
 *   <li>Si el processor devuelve <code>null</code>, el item es filtrado y no llega al writer.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * stepBuilder.&lt;ClienteEnunciado, ClienteEnunciado&gt;chunk(100)
 *     .reader(reader)
 *     .processor(clienteProcessor())
 *     .writer(writer);
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Usa una lambda <code>cliente -&gt; { ... return cliente; }</code> para definir la transformación.</li>
 *   <li>Para limpiar el nombre aplica <code>cliente.getNombre().trim().toUpperCase()</code> y asigna de vuelta.</li>
 * </ul>
 */
@Configuration
public class ImportadorClientesBatchEnunciado {

    /**
     * Define el procesador que normaliza los nombres de los clientes leídos.
     *
     * @return Bean de tipo <code>ItemProcessor</code> que limpia y estandariza el nombre.
     */
    @Bean
    public ItemProcessor<ClienteEnunciado, ClienteEnunciado> clienteProcessor() {
        // TODO: Implementa la lógica de limpieza de nombres
        return null;
    }
}
