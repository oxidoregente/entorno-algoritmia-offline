package com.algoritmia.nivel14;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class MessagingExtraTest {
    @Autowired
    private ApplicationContext context;

    @Test
    void testDLQBeanExists() {
        assertTrue(context.containsBean("deadLetterQueueEnunciado"));
    }
}
