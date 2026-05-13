package com.algoritmia.nivel12.seguridad;

/**
 * 🏆 SOLUCIÓN: Manejador de Tokens JWT.
 */
public class ManejadorTokensSolucion {

    private final JwtUtil jwtUtil;

    public ManejadorTokensSolucion(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    public boolean esAdminValido(String token) {
        if (token == null || !jwtUtil.validarToken(token)) {
            return false;
        }
        String usuario = jwtUtil.obtenerUsuario(token);
        return "admin".equalsIgnoreCase(usuario);
    }
}
