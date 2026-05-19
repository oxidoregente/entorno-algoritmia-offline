# AGENTS.md — Entorno de Algoritmia Offline

## Comandos

| Propósito | Comando |
|-----------|---------|
| Compilar (sin tests) | `mvn clean package -DskipTests` |
| Test completo | `mvn -B clean test` |
| Test individual | `mvn test -Dtest=NombreTest` |
| Docker infra | `docker-compose up -d` (requiere compilar primero) |

> ⚠️ **JAVA_HOME debe apuntar a JDK 21.** Windows: `$env:JAVA_HOME = "C:\Program Files\Eclipse Adoptium\jdk-21.0.11.10-hotspot"`

## Estructura

- **33 niveles** (nivel00–nivel32) en `src/main/java/com/algoritmia/`
- **Triada por ejercicio**: `*Enunciado.java` (implementar) → `*Test.java` (validar) → `*Solucion.java` (referencia)
- Tests en `src/test/java/` replicando la estructura de main

## Convenciones Críticas

- **Solución sin anotaciones Spring** — Las clases `*Solucion.java` no tienen `@Service`/`@Component` para evitar colisiones de beans con `*Enunciado.java`
- **Inyección por constructor** — Prohibido `@Autowired` en campos. Usar constructor con `final`
- **Perfiles Spring**:
  - `dev` (default): H2 en memoria (`application-dev.properties`)
  - `prod`: PostgreSQL + Redis + RabbitMQ + Zipkin + Prometheus (`application-prod.properties`)
- **Flyway**: Migraciones en `src/main/resources/db/migration/`

## Stack

- Java 21, Spring Boot 3.2.5, Maven
- PostgreSQL, Redis, RabbitMQ (Docker)
- JUnit 5, Testcontainers, WireMock

## Estándares Técnicos

Consultar `GEMINI.md` para: patrones de código, nomenclatura, estrategia de testing, y arquitectura.

## TDD Flow

1. Leer Javadoc en `*Enunciado.java`
2. Ejecutar test → falla (Rojo)
3. Implementar en `*Enunciado.java`
4. Ejecutar test → pasa (Verde)
5. Comparar con `*Solucion.java`