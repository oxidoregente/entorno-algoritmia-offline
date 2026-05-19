package com.algoritmia.nivel22.graphql;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.tester.AutoConfigureHttpGraphQlTester;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.graphql.test.tester.HttpGraphQlTester;

/**
 * Test para ejercicio de GraphQL Avanzado.
 * Valida queries con filtros y mutations.
 */
@SpringBootTest
@AutoConfigureHttpGraphQlTester
class GraphQLAvanzadoTest {

    @Autowired
    private HttpGraphQlTester graphQlTester;

    @Test
    void testCalculoIva() {
        String query = "{ calcularIvaSimulado(monto: 100.0) }";
        graphQlTester.document(query)
                .execute()
                .errors()
                .verify();
    }

    @Test
    void testFiltroMonto() {
        String query = "{ filtrarPorMontoMinimo(monto: 50.0) { id monto } }";
        graphQlTester.document(query)
                .execute()
                .errors()
                .verify();
    }
}
