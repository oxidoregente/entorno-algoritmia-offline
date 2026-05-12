package com.brandon.nivel12.seguridad;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

/**
 * RETO: Auth Controller con Roles.
 */
@RestController
@RequestMapping("/api/v1/auth")
public class AuthControllerEnunciado {

    private final JwtUtil jwtUtil;

    public AuthControllerEnunciado(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestParam String usuario, @RequestParam String password) {
        // TODO: Simular login. Si es 'admin', asignar rol 'ROLE_ADMIN'.
        return null;
    }
}
