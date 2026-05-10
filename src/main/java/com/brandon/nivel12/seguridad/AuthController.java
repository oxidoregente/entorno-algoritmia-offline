package com.brandon.nivel12.seguridad;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestParam String usuario, @RequestParam String password) {
        // Simulación de autenticación
        if ("brandon".equals(usuario) && "admin123".equals(password)) {
            String token = jwtUtil.generarToken(usuario);
            return Map.of("token", token);
        }
        throw new RuntimeException("Credenciales inválidas");
    }
}
