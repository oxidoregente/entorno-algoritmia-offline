package com.algoritmia.nivel32.seguridad;

/**
 * 🎓 RETO: Detección de Fuerza Bruta.
 * <b>Dificultad: Difícil</b>
 *
 * <p>Uno de los ataques más comunes contra un sistema de login es el de fuerza bruta:
 * probar miles de combinaciones de usuario/contraseña hasta dar con una válida. La
 * defensa estándar consiste en bloquear temporalmente la cuenta o la IP tras un número
 * de intentos fallidos consecutivos, idealmente apoyándose en un contador distribuido
 * (Redis, Caffeine) para que la protección funcione en clúster.</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>El detector mantiene un contador por <code>usuarioId</code> o IP en una estructura concurrente (AtomicInteger, Cache, Redis).</li>
 *   <li>Si el login es exitoso, se resetea el contador; si falla, se incrementa.</li>
 *   <li>Cuando se supera el umbral (típicamente 5), se considera que hay un ataque en curso.</li>
 *   <li>Opcionalmente, se aplica un <em>cooldown</em> (ventana de tiempo) para reiniciar el contador tras un periodo de inactividad.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * boolean esAtaque(String usuarioId, boolean loginExitoso) {
 *     if (loginExitoso) {
 *         intentos.remove(usuarioId);
 *         return false;
 *     }
 *     int n = intentos.merge(usuarioId, 1, Integer::sum);
 *     return n &gt; UMBRAL;
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Usa un <code>ConcurrentHashMap&lt;String, AtomicInteger&gt;</code> o una cache con TTL (Caffeine, Redis) para persistir los contadores.</li>
 *   <li>Restablece el contador cuando el login es exitoso para no castigar al usuario legítimo.</li>
 *   <li>En producción, registra el evento y combina con un captcha o bloqueo temporal tras N detecciones.</li>
 * </ul>
 */
public class BruteForceDetectorEnunciado {

    /**
     * Evalúa un intento de login y determina si, dada la secuencia de
     * intentos fallidos, debe considerarse un ataque de fuerza bruta.
     *
     * @param usuarioId    identificador del usuario que intenta autenticarse.
     * @param loginExitoso resultado del intento: <code>true</code> si fue correcto.
     * @return <code>true</code> si se supera el umbral de intentos fallidos
     *         (ataque detectado); <code>false</code> en caso contrario.
     */
    public boolean esAtaque(String usuarioId, boolean loginExitoso) {
        // TODO: Si loginExitoso es falso, incrementa un contador para el usuario.
        // Si el contador supera 5, retorna true (ataque detectado).
        return false;
    }
}
