package com.algoritmia.nivel13.cache;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Caché Condicional.
 * <b>Dificultad: Media</b>
 * 
 * <p>No siempre queremos cachear todo. A veces solo queremos cachear 
 * si se cumple una condición (ej: solo usuarios VIP) o si el resultado 
 * no es nulo.</p>
 */
@Service
public class CacheCondicionalEnunciado {

    /**
     * Cachea el resultado solo si el parámetro 'cachear' es verdadero.
     * <b>💡 Pista:</b> Usa el atributo 'condition' de @Cacheable.
     */
    public String obtenerDato(String id, boolean cachear) {
        return "Dato sensible para " + id;
    }

    /**
     * Cachea el resultado solo si la longitud de la respuesta es mayor a 10.
     * <b>💡 Pista:</b> Usa el atributo 'unless' con SpEL (ej: #result.length() < 10).
     */
    public String obtenerDatoLargo(String id) {
        return "Respuesta corta";
    }
}
