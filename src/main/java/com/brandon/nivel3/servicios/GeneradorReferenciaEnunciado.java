package com.brandon.nivel3.servicios;

import org.springframework.stereotype.Service;

/**
 * RETO: Generador de Códigos de Referencia.
 * 
 * Genera un código único para una transacción basado en el cliente y la fecha.
 * Formato: "REF-CLIENTE_ID-TIMESTAMP_MS"
 * Ejemplo: "REF-123-1715520000000"
 * 
 * Si el clienteId es menor o igual a 0, debe lanzar una IllegalArgumentException.
 */
@Service
public class GeneradorReferenciaEnunciado {

    public String generar(long clienteId) {
        // TODO: Implementa la generación de la cadena siguiendo el formato
        return null;
    }
}
