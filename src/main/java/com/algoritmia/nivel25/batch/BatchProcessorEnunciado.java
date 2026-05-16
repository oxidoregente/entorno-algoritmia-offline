package com.algoritmia.nivel25.batch;

import org.springframework.batch.item.ItemProcessor;

/**
 * 🎓 RETO: Procesador de Ítems (ItemProcessor).
 * <b>Dificultad: Media</b>
 * 
 * <p>El procesador es donde ocurre la transformación de los datos entre 
 * la lectura (Reader) y la escritura (Writer).</p>
 */
public class BatchProcessorEnunciado implements ItemProcessor<String, String> {

    @Override
    public String process(String item) {
        // TODO: Transforma el item a mayúsculas y quita espacios en blanco.
        // Si el item es nulo o vacío, retorna null para ignorarlo.
        return null;
    }
}
