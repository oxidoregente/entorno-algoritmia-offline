package com.algoritmia.nivel02.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 🎓 RETO: Filtro de Nombres Únicos.
 * <b>Dificultad: Media</b>
 *
 * <p>Dada una lista de nombres que pueden contener duplicados y estar en minúsculas,
 * implementa una función que procese esta lista para cumplir con los siguientes requisitos:</p>
 * <ol>
 *   <li>Eliminar cualquier nombre duplicado, asegurando que cada nombre aparezca solo una vez en la lista final.</li>
 *   <li>Ordenar los nombres resultantes alfabéticamente de forma ascendente.</li>
 *   <li>Convertir la primera letra de cada nombre a MAYÚSCULA, manteniendo el resto del nombre en minúsculas.</li>
 * </ol>
 * <p>El objetivo es practicar el uso de operaciones de `Stream` de Java para transformar y filtrar colecciones de manera eficiente.</p>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Entrada: nombres = ["ana", "carlos", "ana", "bruno", "ANA"]
 * Salida:  ["Ana", "Bruno", "Carlos"]
 * </pre>
 *
 * <p><b>Pistas:</b></p>
 * <ul>
 *   <li>Utiliza un pipeline de `Stream` para encadenar las operaciones de filtrado, mapeo y ordenación.</li>
 *   <li>Considera el uso de `distinct()`, `sorted()`, y `map()` con funciones lambda para las transformaciones.</li>
 *   <li>Presta atención a cómo manejar nombres `null` o vacíos en la lista de entrada.</li>
 * </ul>
 */
public class FiltroNombresUnicosEnunciado {

    /**
     * Procesa una lista de nombres para eliminar duplicados, ordenar alfabéticamente
     * y capitalizar la primera letra de cada nombre.
     *
     * @param nombres La lista de nombres de entrada, que puede contener duplicados y estar en minúsculas.
     *                Puede contener valores nulos o cadenas vacías.
     * @return Una nueva lista de nombres únicos, ordenados alfabéticamente y con la primera letra en mayúscula.
     *         Retorna una lista vacía si la entrada es nula.
     */
    public List<String> formatearNombres(List<String> nombres) {
        // TODO: Implementa el pipeline de streams
    	
    	List<String> salida = nombres.stream()
    			.filter(e -> e!=null && !e.trim().equals(""))
    			.map(e -> e.toLowerCase())
    			.distinct()
    			.map(e -> Character.toUpperCase(e.charAt(0)) + e.substring(1))
    			.sorted()
    			.collect(Collectors.toList());
    	
    	System.out.println(salida.toString());
    	
        return salida;
    }
}
