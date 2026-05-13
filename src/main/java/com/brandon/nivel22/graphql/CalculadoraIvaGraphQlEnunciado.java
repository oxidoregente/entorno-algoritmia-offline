package com.brandon.nivel22.graphql;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

/**
 * 🎓 RETO: Calculadora de IVA en GraphQL.
 * <b>Dificultad: Fácil</b>
 * 
 * <p>Implementa una consulta simple que reciba un monto y devuelva 
 * el valor del IVA (21%) calculado.</p>
 */
@Controller
public class CalculadoraIvaGraphQlEnunciado {

    @QueryMapping
    public Double calcularIvaSimulado(@Argument Double monto) {
        // TODO: Devuelve el 21% del monto
        return null;
    }
}
