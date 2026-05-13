# Entorno de Algoritmia Offline - "LeetCode Local"

¡Bienvenido al laboratorio de ingeniería de software interactivo! Este repositorio es un recurso de código abierto diseñado para dominar el ecosistema moderno de Java y Spring Boot a través de un enfoque 100% práctico y autónomo.

Este proyecto permite a desarrolladores de todos los niveles fortalecer su lógica de programación, aprender técnicas de testing profesional y comprender arquitecturas empresariales reales sin depender de plataformas externas.

## 🚀 Estructura de Aprendizaje (32 Niveles)

El laboratorio está organizado en **32 niveles técnicos** que contienen **más de 150 retos interactivos**. Cada ejercicio sigue el patrón interactivo de aprendizaje: una clase de reto (`Enunciado`), una referencia optimizada (`Solucion`) y su respectiva prueba unitaria (`Test`) para validar el progreso.

### 🧩 Fase 1: Fundamentos y Lógica Core
*   **Nivel 00: Testing Inverso** -> Introducción al testing; escribe pruebas para código ya funcional.
*   **Nivel 01: Algoritmia Base** -> Lógica pura, estructuras de datos, árboles binarios y recursión.
*   **Nivel 02: Java Funcional** -> Dominio de la API de Streams, Lambdas y procesamiento de colecciones.
*   **Nivel 03: Lógica de Negocio** -> Creación de servicios con `@Service`, inyección de dependencias y Mocks.
*   **Nivel 04: Persistencia JPA** -> Modelado relacional, Query Methods, relaciones y entidades embebidas.
*   **Nivel 05: API REST** -> Exposición de funcionalidades mediante controladores y estándares HTTP.
*   **Nivel 06: Arquitectura Avanzada** -> Patrones DTO con `records`, mappers y manejo global de excepciones.
*   **Nivel 07: Observabilidad AOP** -> Auditoría automática y aspectos transversales del sistema.

### 🏗️ Fase 2: Infraestructura y Sistemas Modernos
*   **Nivel 08: Documentación Dinámica** -> Configuración de Swagger/OpenAPI para autodocumentar la API.
*   **Nivel 09: Dockerización** -> Creación de imágenes de contenedores para despliegue consistente.
*   **Nivel 10: Orquestación (Compose)** -> Gestión de múltiples contenedores (App + DB + Cache).
*   **Nivel 11: Testing de Élite** -> Pruebas de integración real usando **Testcontainers**.
*   **Nivel 12: Seguridad Industrial** -> Protección con **Spring Security + JWT** (Roles y Autorización).
*   **Nivel 13: Optimización con Redis** -> Implementación de caché distribuido (Manual y Declarativo).
*   **Nivel 14: Arquitectura de Eventos** -> Comunicación asíncrona mediante **RabbitMQ (AMQP)**.
*   **Nivel 15: Monitorización 360°** -> Observabilidad con **Spring Boot Actuator + Prometheus**.

### ⚡ Fase 3: Ingeniería de Avanzada y Resiliencia
*   **Nivel 16: Gestión de Entornos** -> Uso de **Spring Profiles** para separar Config de Dev/Prod.
*   **Nivel 17: Evolución de Datos** -> Migraciones de base de datos controladas con **Flyway**.
*   **Nivel 18: Automatización** -> Tareas programadas en segundo plano con **Spring Scheduler**.
*   **Nivel 19: Integración Externa** -> Consumo de APIs externas con **WebClient Reactivo**.
*   **Nivel 20: Notificaciones Pro** -> Envío automatizado de correos electrónicos (**Spring Mail**).
*   **Nivel 21: Diseño Visual** -> Documentación técnica de arquitectura usando diagramas de **Mermaid**.
*   **Nivel 22: Consultas Flexibles** -> Implementación de APIs modernas con **GraphQL**.
*   **Nivel 23: Resiliencia** -> Tolerancia a fallos con el patrón **Circuit Breaker (Resilience4j)**.
*   **Nivel 24: Trazabilidad** -> Seguimiento de peticiones distribuidas con **Micrometer + Zipkin**.

### 🏆 Fase 4: Especialización y Cierre Maestro
*   **Nivel 25: Procesamiento Masivo** -> Gestión de grandes volúmenes de datos con **Spring Batch**.
*   **Nivel 26: Tiempo Real** -> Comunicación bidireccional usando **WebSockets + STOMP**.
*   **Nivel 27: Auditoría de Datos** -> Historial de cambios en entidades con **Hibernate Envers**.
*   **Nivel 28: Simulación de APIs** -> Pruebas deterministas e independientes con **WireMock**.
*   **Nivel 29: Pruebas de Alto Nivel** -> Dominio de **Pruebas Parametrizadas** en JUnit 5.
*   **Nivel 30: Orquestación Global** -> El "Final Boss": coordinar DB, Caché y Mensajería en un solo flujo.
*   **Nivel 31: Lógica Reactiva** -> Programación asíncrona avanzada con **Project Reactor**.
*   **Nivel 32: Seguridad Proactiva** -> Implementación de detectores de intrusos y alertas críticas.

## 🛠️ Requisitos del Sistema
- **Java 21 LTS**
- **Maven 3.8+**
- **Docker & Docker Compose**

## 🐳 Ejecución con Docker (Full Stack)
Levanta todo el ecosistema profesional con un solo comando:
1. `mvn clean package -DskipTests`
2. `docker-compose up --build`

**Endpoints principales:**
- API Principal: `http://localhost:8080`
- Swagger UI: `/swagger-ui/index.html`
- Prometheus: `http://localhost:9090`
- Zipkin Tracing: `http://localhost:9411`
- RabbitMQ Admin: `http://localhost:15672` (guest/guest)

## 🧪 Cómo Usar y Probar el Proyecto (TDD Flow)
1. **Selecciona un Reto:** Abre una clase `[Nombre]Enunciado.java`.
2. **Corre el Test:** Ejecuta su respectivo `[Nombre]Test.java` (fallará en **rojo**).
3. **Programa:** Implementa la lógica en la clase `Enunciado`.
4. **Valida:** Ejecuta el test hasta obtener el **verde**.
5. **Compara:** Consulta `[Nombre]Solucion.java` para ver mejores prácticas.

---
## 🤝 Créditos y Autoría
Este laboratorio es una iniciativa educativa desarrollada por **Brandon**, estudiante de Ingeniería de Sistemas, en colaboración con inteligencia artificial (Gemini). El objetivo es democratizar el acceso a arquitecturas de software de alta calidad.

---
*Construyendo código sólido, un test a la vez.*
