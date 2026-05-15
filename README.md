# 🚀 Entorno de Algoritmia Offline - "LeetCode Local"

¡Bienvenido al laboratorio de ingeniería de software interactivo! Este repositorio es un recurso de código abierto diseñado para dominar el ecosistema moderno de Java y Spring Boot a través de un enfoque **100% práctico, offline y autónomo**.

## 🎯 Propósito del Proyecto
Este proyecto permite a desarrolladores de todos los niveles fortalecer su lógica de programación, aprender técnicas de testing profesional y comprender arquitecturas empresariales reales sin depender de plataformas externas. Es ideal para entornos sin conexión o para quienes prefieren la velocidad y potencia de su propio IDE (IntelliJ, VS Code, Eclipse).

---

## 🏗️ Estructura de Aprendizaje (32 Niveles)

El laboratorio está organizado en **32 niveles técnicos** que contienen **más de 150 retos interactivos**. Cada ejercicio sigue el **Patrón Reto-Solución**:
1.  **Enunciado:** Clase con métodos vacíos y documentación Javadoc detallada (incluyendo ejemplos y pistas algorítmicas).
2.  **Solución:** Referencia optimizada y pedagógica con la implementación completa.
3.  **Test:** Prueba unitaria profesional que valida automáticamente tu progreso.

### 🧩 Fase 1: Fundamentos y Lógica Core
*   **Nivel 00: Testing Inverso** -> Domina el patrón AAA (Arrange-Act-Assert) escribiendo pruebas para código funcional.
*   **Nivel 01: Algoritmia Base** -> Lógica pura, estructuras de datos (Arrays, Strings), árboles y recursión.
*   **Nivel 02: Java Funcional** -> Dominio de Streams API, Lambdas y procesamiento de colecciones avanzado.
*   **Nivel 03: Lógica de Negocio** -> Creación de servicios Spring (`@Service`), inyección de dependencias y Mocking.
*   **Nivel 04: Persistencia JPA** -> Modelado relacional, Query Methods y relaciones `@ManyToOne`.
*   **Nivel 05: API REST** -> Exposición de controladores, estándares HTTP y códigos de estado.
*   **Nivel 06: Arquitectura Avanzada** -> Uso de `records` de Java 21, mappers y manejo global de excepciones.
*   **Nivel 07: Observabilidad AOP** -> Programación Orientada a Aspectos para auditoría y validación transversal.

### 🏗️ Fase 2: Infraestructura y Modernización
*   **Nivel 08: Documentación Dinámica** -> Autodocumentación de APIs con **Swagger UI / OpenAPI**.
*   **Nivel 09: Dockerización** -> Empaquetado de aplicaciones en contenedores Docker.
*   **Nivel 10: Orquestación** -> Gestión de ecosistemas multi-contenedor con **Docker Compose**.
*   **Nivel 11: Testing de Élite** -> Pruebas de integración contra bases de datos reales usando **Testcontainers**.
*   **Nivel 12: Seguridad Industrial** -> Protección con **Spring Security + JWT** (Roles y Autorización).
*   **Nivel 13: Optimización con Redis** -> Estrategias de caché distribuido (Manual y Declarativo).
*   **Nivel 14: Arquitectura de Eventos** -> Comunicación asíncrona mediante **RabbitMQ (AMQP)**.
*   **Nivel 15: Monitorización 360°** -> Métricas con **Actuator + Prometheus**.

### ⚡ Fase 3: Ingeniería de Avanzada y Resiliencia
*   **Nivel 16-18:** Gestión de entornos (Profiles), Flyway (Migraciones) y Automatización (Scheduler).
*   **Nivel 19-21:** Consumo de APIs (WebClient), Notificaciones (Mail) y Diseño (Mermaid).
*   **Nivel 22-24:** APIs modernas (GraphQL), Resiliencia (Circuit Breaker) y Trazabilidad (Zipkin).

### 🏆 Fase 4: Especialización y Cierre Maestro
*   **Nivel 25-28:** Procesamiento masivo (Batch), Tiempo Real (WebSockets), Auditoría (Envers) y Simulación (WireMock).
*   **Nivel 29-32:** JUnit 5 Avanzado, Orquestación Global, Programación Reactiva y Seguridad Proactiva.

---

## 🛠️ Requisitos del Sistema
- **Java 21 LTS** (Mandatorio)
- **Maven 3.8+**
- **Docker & Docker Compose** (Para niveles 09-11 y superior)

---

## 🧪 Flujo de Trabajo (TDD Flow)
El aprendizaje está diseñado para ser iterativo y validado por tests:

1.  **Selecciona un Reto:** Navega a un paquete (ej: `nivel01.arrays`) y abre una clase `[Nombre]Enunciado.java`.
2.  **Lee la Documentación:** Los Javadocs contienen la explicación teórica, ejemplos visuales (como el algoritmo de la Tortuga y Liebre) y pistas.
3.  **Corre el Test:** Ejecuta el test asociado (ej: `[Nombre]Test.java`). Verás que falla (**Rojo**).
4.  **Implementa:** Escribe tu código en la clase `Enunciado`.
5.  **Refactoriza y Valida:** Ejecuta el test nuevamente hasta que pase (**Verde**).
6.  **Compara:** Abre `[Nombre]Solucion.java` para comparar tu enfoque con una solución industrial documentada.

---

## 🐳 Ejecución del Ecosistema Completo
Para levantar todos los servicios de infraestructura (Postgres, Redis, RabbitMQ, Zipkin, Prometheus):
```powershell
# Compila el proyecto saltando los tests (ya que requieren Docker levantado)
mvn clean package -DskipTests

# Levanta todos los contenedores
docker-compose up -d
```

**Dashboards Locales:**
- **Swagger UI:** `http://localhost:8080/swagger-ui/index.html`
- **Prometheus:** `http://localhost:9090`
- **Zipkin:** `http://localhost:9411`
- **RabbitMQ:** `http://localhost:15672` (guest/guest)

---

## 🤝 Créditos y Contribuciones
Este laboratorio es una iniciativa de **Brandon**, estudiante de Ingeniería de Sistemas, con el apoyo de **Gemini**. El objetivo es democratizar el acceso a arquitecturas de software de alta calidad.

*¡Feliz código! Recuerda: el software es el arte de resolver problemas, un test a la vez.*
