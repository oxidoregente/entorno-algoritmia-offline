package com.algoritmia.nivel20.graphql;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

/**
 * 🎓 RETO: Calculadora de IVA en GraphQL.
 * <b>Dificultad: Fácil</b>
 *
 * <p>En un e-commerce o sistema de facturación, el cliente GraphQL puede solicitar
 * el cálculo del impuesto sobre un monto sin tener que mantener esa lógica en el frontend.
 * Esto centraliza el cálculo en el backend y evita inconsistencias entre clientes.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>Usa <code>@QueryMapping</code> para exponer la operación como Query en el schema GraphQL.</li>
 *   <li>Usa <code>@Argument</code> para recibir parámetros desde la query.</li>
 *   <li>El porcentaje de IVA (21%) puede definirse como constante.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * # Query GraphQL
 * query { calcularIvaSimulado(monto: 100.0) }
 *
 * # Respuesta esperada
 * { "data": { "calcularIvaSimulado": 21.0 } }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>El nombre del método Java se convierte en el nombre del campo en el schema.</li>
 *   <li>Multiplica el monto por 0.21 para obtener el IVA.</li>
 * </ul>
 */
@Controller
public class CalculadoraIvaGraphQlEnunciado {

    /**
     * Calcula el valor del IVA (21%) sobre el monto recibido.
     *
     * @param monto Base imponible sobre la que se calcula el impuesto.
     * @return Valor del IVA correspondiente al 21% del monto, o {@code null} si el monto es {@code null}.
     */
    @QueryMapping
    public Double calcularIvaSimulado(@Argument Double monto) {
        // TODO: Devuelve el 21% del monto
        return null;
    }
}
