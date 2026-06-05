# 🤝 Guía de Contribución

¡Gracias por interesarte en mejorar este proyecto! Esta guía explica cómo añadir nuevos ejercicios manteniendo la coherencia con los existentes.

## 📋 Convenciones de Nomenclatura

| Tipo de archivo | Convención | Ejemplo |
|-----------------|------------|---------|
| Ejercicio a implementar | `*Enunciado.java` | `TwoSumEnunciado.java` |
| Test unitario | `*Test.java` | `TwoSumTest.java` |
| Solución de referencia | `*Solucion.java` | `TwoSumSolucion.java` |

> **Regla absoluta:** Un principiante debe poder ejecutar `mvn test -Dtest=NombreTest` y que funcione para cualquier nivel, sin tener que recordar excepciones.

### ⚠️ Lo que NO debes hacer

- ❌ `*TestEnunciado.java` (sufijo doble, confunde)
- ❌ `*EnunciadoTest.java` (orden invertido)
- ❌ Mezclar nombres en español e inglés dentro del mismo paquete

## 📦 Estructura de un Ejercicio

Cada triada debe respetar esta estructura:

```
nivelXX/tema/
├── [Nombre]Enunciado.java    ← Aquí escribe el alumno
├── [Nombre]Test.java         ← Valida la implementación
└── [Nombre]Solucion.java     ← Referencia para comparar al final
```

## 📝 Plantilla de Javadoc para Enunciado

Copia y adapta esta plantilla al crear un nuevo ejercicio:

```java
package com.algoritmia.nivelXX.tema;

import java.util.List;

/**
 * 🎓 RETO: [Nombre descriptivo del ejercicio].
 * <b>Dificultad: [Fácil | Media | Difícil]</b>
 *
 * <p>[Contexto de negocio: ¿por qué importa este problema? ¿Dónde se usa en la vida real?]</p>
 *
 * <p><b>Reglas / Requisitos:</b></p>
 * <ul>
 *   <li>[Regla 1]</li>
 *   <li>[Regla 2]</li>
 *   <li>[Casos borde a considerar]</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * Entrada: [datos de entrada]
 * Salida:  [resultado esperado]
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>[Pista concreta 1: API a usar]</li>
 *   <li>[Pista concreta 2: estructura de datos sugerida]</li>
 *   <li>[Pista concreta 3: caso borde importante]</li>
 * </ul>
 */
public class [Nombre]Enunciado {

    /**
     * [Descripción breve de qué hace el método].
     *
     * @param [nombre] [descripción del parámetro]
     * @return [descripción del valor de retorno]
     * @throws [excepción] [cuándo se lanza]
     */
    public [Tipo] nombreMetodo([parámetros]) {
        // TODO: Implementa tu lógica aquí
        return null; // o throw new UnsupportedOperationException();
    }
}
```

## ✅ Lista de Verificación antes de hacer Commit

- [ ] El archivo `*Enunciado.java` compila y el test falla (estado Rojo del TDD).
- [ ] El test `*Test.java` sigue el patrón Arrange-Act-Assert con comentarios.
- [ ] La `*Solucion.java` hace pasar el test (estado Verde).
- [ ] La `*Solucion.java` **NO** tiene `@Service` ni `@Component` (evita colisiones de beans con la `*Enunciado.java`).
- [ ] El Javadoc tiene: emoji 🎓, dificultad, ejemplo en `<pre>`, pistas.
- [ ] Las dependencias inyectadas son por constructor (prohibido `@Autowired` en campos).
- [ ] El nivel del paquete es coherente con la progresión del proyecto (no importas clases de niveles superiores).

## 🏗️ Regla de Progresión entre Niveles

> **Regla de oro:** Un nivel `N` solo puede depender de niveles `M` donde `M < N`.

Esto significa:

| ✅ Permitido | ❌ Prohibido |
|--------------|-------------|
| Nivel 14 importa de nivel 03 | Nivel 03 importa de nivel 14 |
| Nivel 20 importa de nivel 14 | Nivel 14 importa de nivel 20 |
| Nivel 32 importa de nivel 20 | Nivel 20 importa de nivel 32 |

### ¿Por qué?

Un principiante avanza linealmente. Si un ejercicio de nivel bajo requiere conceptos de un nivel alto, se frustra. La regla garantiza que cada nivel sea auto-contenido o use solo lo ya aprendido.

### ¿Cómo desacoplar si necesitas algo "de un nivel superior"?

1. **Usa abstracciones nativas de Spring:** `ApplicationEventPublisher` (en lugar de RabbitMQ directo), `Environment` (en lugar de properties concretas), etc.
2. **Crea una interfaz en el nivel inferior** (punto neutro) y haz que el nivel superior la implemente.
3. **Documenta la dependencia futura** en el Javadoc del método.

## 🧪 Cómo Probar tu Ejercicio Localmente

```bash
# Ejecutar solo tu test
mvn test -Dtest=[Nombre]Test

# Verificar que el proyecto entero compila
mvn test-compile

# Ejecutar todos los tests
mvn test
```

## 🎨 Estilo de Código

- **Java 21 LTS:** usa `var`, pattern matching, switch expressions.
- **Records** para DTOs y objetos inmutables.
- **Sin comentarios en la lógica** (los Javadoc son la documentación).
- **Nombres en español** para el dominio (clases, variables), pero los métodos de la API de Java en inglés (es inevitable).

---

¿Dudas? Abre un issue o consulta `AGENTS.md` para más detalles sobre comandos y arquitectura.
