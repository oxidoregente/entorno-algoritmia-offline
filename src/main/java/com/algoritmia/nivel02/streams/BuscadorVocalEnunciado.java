package com.algoritmia.nivel02.streams;

import java.util.List;

/**
 * 🎓 RETO: Buscador de Iniciales.
 * <b>Dificultad: Fácil</b>
 * 
 * <p>Determina si en una lista de palabras existe al menos una que empiece 
 * con la letra 'Á' (ignorando mayúsculas/minúsculas).</p>
 */
public class BuscadorVocalEnunciado {

    public boolean existePalabraConA(List<String> palabras) {
        // TODO: Implementa usando .stream() y .anyMatch()
    	
        return palabras.stream()
        		.anyMatch(e-> e!= null && e.toLowerCase().startsWith("á"));
    }
}
