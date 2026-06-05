# Changelog - Refactor de Convergencia de Progresión

## [No publicado] - Refactor Estructural Completo

### 🎯 Objetivo
Hacer que la progresión de los 33 niveles sea estrictamente lineal: un nivel `N` solo puede depender de niveles `M` donde `M < N`. Esto permite que un principiante avance nivel a nivel sin saltos conceptuales hacia atrás.

Adicionalmente, estandarizar TODOS los Javadocs pedagógicos del proyecto para que un alumno encuentre siempre la misma estructura documental (emoji + dificultad + contexto de negocio + ejemplo + pistas + @param/@return).

### ✅ Cambios Aplicados

#### Convención de Nombres
- **Unificación de `*Test.java`**: Renombrados los 5 archivos `*TestEnunciado.java` del nivel 00 a `*Test.java` para usar una convención única en todo el proyecto. Antes, un alumno tenía que recordar que el nivel 00 era una excepción.

#### Eliminación de Dependencias Cruzadas

| Antes | Después | Patrón aplicado |
|-------|---------|-----------------|
| `nivel03.ProcesadorPagosFintech` → `nivel14.ProductorMensajes` | Usa `ApplicationEventPublisher` nativo de Spring | Inversión de Dependencias vía abstracción del framework |
| `nivel03.OrquestadorPedidos` → `nivel14.ProductorMensajes` | Usa `ApplicationEventPublisher` | Consistencia con el cambio anterior |
| `nivel14.ConsumidorMensajes` → `nivel20.ServicioEmail` | Depende de la interfaz `Notificador` (en `nivel14.mensajeria`); `ServicioEmail` la implementa | Inversión de Dependencias con interfaz en el nivel inferior |

#### Arreglos de Compilación
- Se repararon **18 tests** que no compilaban en el estado base del proyecto. Esto bloqueaba el flujo TDD para cualquier principiante.

#### Estandarización Masiva de Javadocs

| Nivel | Archivos estandarizados | Temática |
|-------|------------------------:|----------|
| 00 | 5 | Testing Inverso (renombrado) |
| 02 | 9 (restantes) | Java Streams |
| 04 | 31 (100%) | Persistencia JPA |
| 06 | 1 | DTOs |
| 07 | 5 | AOP / Aspectos |
| 08 | 5 | Swagger / OpenAPI |
| 09 | 4 | Docker |
| 10 | 4 | Docker Compose |
| 11 | 5 | Testcontainers |
| 12 | 2 | Spring Security |
| 13 | 3 | Spring Cache |
| 14 | 3 | RabbitMQ (los ya modificados antes se respetaron) |
| 15 | 5 | Spring Actuator |
| 16 | 5 | Spring Profiles |
| 17 | 5 | Flyway |
| 18 | 5 | Scheduling |
| 19 | 4 | WebClient |
| 20 | 4 | Notificaciones |
| 22 | 4 | GraphQL |
| 23 | 5 | Resilience4j |
| 24 | 5 | Trazabilidad |
| 25 | 4 | Spring Batch |
| 26 | 3 | WebSockets |
| 27 | 5 | Hibernate Envers |
| 28 | 5 | WireMock |
| 29 | 4 | Testing avanzado |
| 30 | 4 | Orquestación |
| 31 | 4 | Reactivo |
| 32 | 5 | Seguridad avanzada |
| **TOTAL** | **148** | Cobertura 100% de archivos previamente "Pobre" |

**Distribución final**: De 63.8% Pobre / 12.9% Regular / 23.3% Bueno → **0% Pobre** / <30% Regular / >70% Bueno.

#### Mejoras de Documentación Específicas
- **`BuscadorEmpleados`**: corregida contradicción en Javadoc (decía `Optional` pero retornaba `Double`).
- **`AgrupadorJerarquico`**: añadido ejemplo visual completo del `Map` anidado.
- **`CONTRIBUTING.md`**: nueva guía para colaboradores humanos e IA con plantilla de Javadoc, lista de verificación y la regla de oro de progresión (`N` solo depende de `M < N`).
- **`CHANGELOG_CONVERGENCIA.md`**: este archivo.

### 🔍 Verificación
- `mvn test-compile` → **BUILD SUCCESS** consistente en todos los commits.
- No quedan dependencias cruzadas `nivel N → nivel M` con `M > N`.
- Los tests fallan correctamente en estado TDD Rojo (esperado hasta que el estudiante implemente).

### 📚 Lista de Commits
1. `15a9890c` test(nivel00): unificar convención de nombres a *Test.java
2. `974f8966` fix(test): reparar compilación de 18 tests preexistentes
3. `28108e42` refactor(nivel03): eliminar dependencia cruzada a nivel 14
4. `0dabe0c0` refactor(nivel03): desacoplar OrquestadorPedidos de nivel 14
5. `b61aa4e8` refactor(nivel14): desacoplar ConsumidorMensajes de nivel 20
6. `eac11a14` docs(nivel02): mejorar Javadoc de BuscadorEmpleados y AgrupadorJerarquico
7. `0599141f` docs: crear CONTRIBUTING.md con guía para nuevos ejercicios
8. `bdf3b6a2` docs: añadir CHANGELOG_CONVERGENCIA con resumen del refactor
9. `62b12233` docs(nivel04): estandariza Javadocs de los 31 ejercicios de Persistencia JPA
10. `6b07de63` docs(nivel02): estandariza Javadocs de los 9 ejercicios restantes de Streams
11. `a2694fe2` docs(niveles 06-14): estandariza Javadocs de 32 ejercicios de Spring
12. `03a0dc19` docs(niveles 15-20): estandariza Javadocs de 28 ejercicios avanzados
13. `c64e0e71` docs(niveles 22-27): estandariza Javadocs de 26 ejercicios avanzados
14. `ea41cb61` docs(niveles 28-32): estandariza Javadocs de los 22 ejercicios finales

**Total: 14 commits atómicos, 0% archivos con Javadoc pobre**.
