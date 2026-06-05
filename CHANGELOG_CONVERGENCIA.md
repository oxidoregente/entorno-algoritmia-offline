# Changelog - Refactor de Convergencia de Progresión

## [No publicado] - Refactor Estructural

### 🎯 Objetivo
Hacer que la progresión de los 33 niveles sea estrictamente lineal: un nivel `N` solo puede depender de niveles `M` donde `M < N`. Esto permite que un principiante avance nivel a nivel sin saltos conceptuales hacia atrás.

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
- Se repararon **18 tests** que no compilaban en el estado base del proyecto. Esto bloqueaba el flujo TDD para cualquier principiante. Los tests de nivel 04 (JPA) ahora están listos para activarse cuando el estudiante implemente los Query Methods en los `*Enunciado.java` correspondientes.

#### Mejoras de Documentación
- **`BuscadorEmpleados`**: corregida contradicción en Javadoc (decía `Optional` pero retornaba `Double`).
- **`AgrupadorJerarquico`**: añadido ejemplo visual completo del `Map` anidado.
- **`CONTRIBUTING.md`**: nueva guía para colaboradores humanos e IA con plantilla de Javadoc, lista de verificación y la regla de oro de progresión.

### 🔍 Verificación
- `mvn test-compile` → **BUILD SUCCESS**
- No quedan dependencias cruzadas `nivel N → nivel M` con `M > N`.
- Los tests fallan correctamente en estado TDD Rojo (esperado hasta que el estudiante implemente).

### 📚 Archivos Afectados
- 5 renombrados en `nivel00/testing/`
- 3 modificados en `nivel03/servicios/` (ProcesadorPagosFintech, OrquestadorPedidos y sus tests)
- 4 modificados en `nivel14/mensajeria/` (nueva interfaz `Notificador`, refactor de `ConsumidorMensajes`)
- 1 modificado en `nivel20/notificaciones/` (`ServicioEmailEnunciado` implementa `Notificador`)
- 18 tests reparados en `nivel02`, `nivel04`, `nivel19`, `nivel31`
- 2 Javadocs mejorados en `nivel02/streams/`
- 1 nuevo archivo `CONTRIBUTING.md`
- 1 nuevo archivo `CHANGELOG_CONVERGENCIA.md` (este archivo)
