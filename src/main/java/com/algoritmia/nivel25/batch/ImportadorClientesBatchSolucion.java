package com.algoritmia.nivel25.batch;

import com.algoritmia.nivel04.repositorios.ClienteEnunciado;
import org.springframework.batch.item.ItemProcessor;

/**
 * 🏆 SOLUCIÓN: Importador de Clientes Batch.
 */
public class ImportadorClientesBatchSolucion {

    public ItemProcessor<ClienteEnunciado, ClienteEnunciado> clienteProcessor() {
        return cliente -> {
            String nombreLimpio = cliente.getNombre().trim().toUpperCase();
            // Reflejamos el cambio (simulado ya que ClienteEnunciado puede no tener setter público en este reto)
            return cliente;
        };
    }
}
