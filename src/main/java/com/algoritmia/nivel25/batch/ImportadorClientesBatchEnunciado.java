package com.algoritmia.nivel25.batch;

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
 * <p>Implementa un procesador para un Job de Batch que limpie los nombres de los clientes
 * eliminando espacios en blanco innecesarios y convirtiendo a mayúsculas.</p>
 */
@Configuration
public class ImportadorClientesBatchEnunciado {

    @Bean
    public ItemProcessor<ClienteEnunciado, ClienteEnunciado> clienteProcessor() {
        // TODO: Implementa la lógica de limpieza de nombres
        return null;
    }
}
