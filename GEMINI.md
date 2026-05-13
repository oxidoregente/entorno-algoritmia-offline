# Directrices del Proyecto - Algoritmia Offline

Este archivo contiene los estándares técnicos y mandatos arquitectónicos para el mantenimiento de este laboratorio.

## 🏗️ Arquitectura y Patrones
- **Capas:** Estricta separación `Controller -> Service -> Repository`.
- **Patrón Reto-Solución:** Todo nuevo ejercicio debe constar de:
    1. `[Nombre]Enunciado.java`: Clase con @Service/@Component (si aplica) y métodos vacíos.
    2. `[Nombre]Solucion.java`: Lógica funcional sin anotaciones de Spring (para evitar colisiones de beans).
    3. `[Nombre]Test.java`: Prueba unitaria que evalúa exclusivamente al Enunciado.
- **DTOs:** Uso obligatorio de `records` de Java 21 para el transporte de datos (Nivel 06).
- **Excepciones:** Validación de negocio mediante excepciones personalizadas capturadas por `ManejadorGlobalExcepciones`.

## 💻 Estándares de Código
- **Lenguaje:** Java 21 LTS (Uso de Pattern Matching, Switch mejorado y Virtual Threads cuando sea posible).
- **Nomenclatura:** Paquetes organizados cronológicamente con dos dígitos (`nivel01`, `nivel02`...).
- **Documentación:** Javadoc extenso en español para fines pedagógicos en todas las clases de Solución.
- **Inyección de Dependencias:** Únicamente por constructor. Prohibido el uso de `@Autowired` en campos.

## 🧪 Estrategia de Testing
- **Unitarios:** Patrón **Arrange-Act-Assert (AAA)** con JUnit 5 y Mockito para aislamiento total.
- **Integración:** `@DataJpaTest` para persistencia y `Testcontainers` para validaciones contra PostgreSQL real.
- **Contratos:** `WireMock` para simulación de dependencias externas (Nivel 28).
- **Observabilidad:** Integración nativa de Tracing (Zipkin) y Métricas (Prometheus) en las pruebas.

## 🛠️ Stack Tecnológico
- **Core:** Spring Boot 3.x, Spring Data JPA, Spring Security.
- **Mensajería:** RabbitMQ (AMQP).
- **Caché:** Redis.
- **Datos:** PostgreSQL (Producción) / H2 (Desarrollo).
- **Migraciones:** Flyway.
- **Monitorización:** Spring Boot Actuator + Micrometer.
