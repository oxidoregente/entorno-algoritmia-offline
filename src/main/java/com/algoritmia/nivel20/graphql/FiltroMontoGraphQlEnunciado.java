package com.algoritmia.nivel20.graphql;

import com.algoritmia.nivel04.repositorios.TransaccionEnunciado;
import com.algoritmia.nivel04.repositorios.TransaccionRepositoryEnunciado;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 🎓 RETO: Filtros Complejos en GraphQL.
 * <b>Dificultad: Difícil</b>
 *
 * <p>En una app de finanzas personales, el usuario puede pedir desde el cliente
 * "muéstrame las transacciones mayores a X". El resolver recibe el argumento y
 * devuelve solo las que cumplen el criterio, evitando traer todo el dataset.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>El resolver combina acceso a datos (<code>Repository</code>) con filtrado en memoria usando Streams.</li>
 *   <li>Usa <code>@QueryMapping</code> + <code>@Argument</code> para exponer la query.</li>
 *   <li>Para datasets grandes sería preferible filtrar a nivel SQL (Specification/Query), pero aquí se hace en lógica.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * # Query GraphQL
 * query { filtrarPorMontoMinimo(monto: 500.0) { id monto fecha } }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Obtén todas las transacciones con <code>repository.findAll()</code>.</li>
 *   <li>Aplica un <code>stream().filter(t -&gt; t.getMonto() &gt; monto)</code> y recolecta con <code>Collectors.toList()</code>.</li>
 * </ul>
 */
@Controller
public class FiltroMontoGraphQlEnunciado {

    private final TransaccionRepositoryEnunciado repository;

    public FiltroMontoGraphQlEnunciado(TransaccionRepositoryEnunciado repository) {
        this.repository = repository;
    }

    /**
     * Devuelve la lista de transacciones cuyo monto supera el umbral recibido.
     *
     * @param monto Monto mínimo a partir del cual se incluyen las transacciones.
     * @return Lista de transacciones filtradas, o {@code null} si la implementación aún no está lista.
     */
    @QueryMapping
    public List<TransaccionEnunciado> filtrarPorMontoMinimo(@Argument Double monto) {
        // TODO: Obtén todas las transacciones y filtra usando Streams aquellas con monto > parámetro
        return null;
    }
}
