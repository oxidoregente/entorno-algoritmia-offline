package com.brandon.nivel12.seguridad;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

/**
 * SOLUCIÓN: Auth Controller con Roles.
 */
public class AuthControllerSolucion {

    private final JwtUtil jwtUtil;

    public AuthControllerSolucion(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestParam String usuario, @RequestParam String password) {
        if ("admin".equals(usuario) && "admin123".equals(password)) {
            String token = jwtUtil.generarToken(usuario); // En producción se incluirían los roles en el token
            return Map.of("token", token, "rol", "ADMIN");
        }
        throw new RuntimeException("Credenciales inválidas");
    }
}
