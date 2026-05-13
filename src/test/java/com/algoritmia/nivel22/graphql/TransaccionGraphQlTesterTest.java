package com.algoritmia.nivel22.graphql;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.tester.AutoConfigureHttpGraphQlTester;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.graphql.test.tester.HttpGraphQlTester;

@SpringBootTest
@AutoConfigureHttpGraphQlTester
class TransaccionGraphQlTesterTest {

    @Autowired
    private HttpGraphQlTester graphQlTester;

    @Test
    void testQueryTodas() {
        String document = "{ todasLasTransacciones { id monto } }";
        
        graphQlTester.document(document)
                .execute()
                .errors()
                .verify(); 
    }
}
