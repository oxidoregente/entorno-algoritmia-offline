package com.algoritmia.nivel03.servicios;

/**
 * 🏆 SOLUCIÓN: Validador de Email Empresarial.
 * 
 * <p>Teoría: El manejo de Strings es fundamental en cualquier servicio. 
 * Aquí usamos métodos nativos de Java como .contains(), .endsWith() y .indexOf() 
 * para una validación rápida y eficiente sin necesidad de regex complejos.</p>
 */
public class ValidadorEmailSolucion {

    public boolean esEmailValido(String email) {
        if (email == null || email.isBlank()) return false;
        
        // Regla 3: No espacios
        if (email.contains(" ")) return false;

        // Regla 1: Exactamente un '@'
        int indexArroba = email.indexOf('@');
        if (indexArroba == -1 || indexArroba != email.lastIndexOf('@')) return false;

        // Regla 2: Termina en .com o .org
        return email.toLowerCase().endsWith(".com") || email.toLowerCase().endsWith(".org");
    }
}
