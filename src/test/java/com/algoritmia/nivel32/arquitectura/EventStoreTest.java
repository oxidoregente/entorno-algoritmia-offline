package com.algoritmia.nivel32.arquitectura;

import static org.junit.jupiter.api.Assertions.*;
import com.algoritmia.nivel32.arquitectura.EventStoreEnunciado.EventStore;
import com.algoritmia.nivel32.arquitectura.EventStoreEnunciado.EventoDeposito;
import com.algoritmia.nivel32.arquitectura.EventStoreEnunciado.EventoRetiro;
import org.junit.jupiter.api.Test;

class EventStoreTest {

    @Test
    void testReplayCalculoSaldo() {
        EventStore store = new EventStore();
        store.append(new EventoDeposito(100));
        store.append(new EventoRetiro(30));
        store.append(new EventoDeposito(50));
        assertEquals(120, store.replay());
    }

    @Test
    void testEventStoreVacio() {
        EventStore store = new EventStore();
        assertEquals(0, store.replay());
    }
}
