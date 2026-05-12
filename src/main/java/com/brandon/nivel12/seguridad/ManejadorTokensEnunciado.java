package com.brandon.nivel12.seguridad;

import org.springframework.stereotype.Service;

/**
 * 🎓 RETO: Manejador de Tokens JWT.
 * <b>Dificultad: Difícil</b>
 * 
 * <p>Implementa un servicio que analice la validez de un token y verifique 
 * si el usuario tiene privilegios de ADMIN.</p>
 */
@Service
public class ManejadorTokensEnunciado {

    private final JwtUtil jwtUtil;

    public ManejadorTokensEnunciado(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    public boolean esAdminValido(String token) {
        // TODO: Valida el token usando jwtUtil.validarToken()
        // TODO: Obtén el usuario y verifica si es igual a "admin"
        return false;
    }
}
