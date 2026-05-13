# Entorno de Algoritmia Offline - "LeetCode Local"

¡Bienvenido! Este repositorio es un laboratorio de aprendizaje de código abierto diseñado para dominar el ecosistema moderno de Java y Spring Boot de forma 100% práctica y sin conexión a internet. 

El proyecto nació como una iniciativa personal de **Brandon**, estudiante de Ingeniería de Sistemas, en colaboración con inteligencia artificial (Gemini), con el objetivo de crear un entorno de pruebas robusto donde cualquier desarrollador pueda mejorar su lógica de programación, aprender testing y dominar arquitecturas reales sin depender de plataformas web externas.

## 🚀 Estructura de Aprendizaje

El código está dividido en niveles progresivos, contando con **más de 60 retos interactivos** (puedes consultar el [Catálogo Completo aquí](CHALLENGES.md)). Cada ejercicio incluye su propia clase de lógica (`Enunciado`), su referencia optimizada (`Solucion`) y su respectiva prueba unitaria (`Test`), documentada exhaustivamente.

### Niveles Base (Core Java & Spring)
00. **Nivel 00: Testing Inverso (`com.brandon.nivel00`)** -> Aprende a escribir pruebas para código ya existente.
01. **Nivel 01: Algoritmia Base (`com.brandon.nivel01`)** -> Lógica pura, estructuras de datos, árboles y recursión.
02. **Nivel 02: Java Funcional (`com.brandon.nivel02`)** -> Procesamiento de colecciones con la API de Streams y Lambdas.
03. **Nivel 03: Lógica de Negocio (`com.brandon.nivel03`)** -> Creación de servicios con `@Service` e inyección de dependencias.
04. **Nivel 04: Persistencia JPA (`com.brandon.nivel04`)** -> Modelado relacional, Query Methods y relaciones `@ManyToOne`.
05. **Nivel 05: API REST (`com.brandon.nivel05`)** -> Exposición de funcionalidades mediante `@RestController` y Swagger.
06. **Nivel 06: Arquitectura Avanzada (`com.brandon.nivel06`)** -> Patrones DTO con `records` y manejo de excepciones globales.
07. **Nivel 07: Observabilidad AOP (`com.brandon.nivel07`)** -> Auditoría automática de servicios mediante Aspectos.

### Niveles de Infraestructura & Sistemas Distribuidos
- **Nivel 08-11:** Documentación Dinámica (Swagger), Dockerización y Testing de Élite con **Testcontainers**.
- **Nivel 12:** Seguridad Industrial con **Spring Security + JWT** (Roles ADMIN/USER).
- **Nivel 13-14:** Optimización con **Redis Cache** y Mensajería Asíncrona con **RabbitMQ**.
- **Nivel 15:** Monitorización de Grado de Producción con **Actuator + Prometheus**.
- **Nivel 16-17:** Gestión de Entornos (Profiles) y Evolución de Datos con **Flyway**.
- **Nivel 18-20:** Automatización (Scheduler), Integración Externa (WebClient) y Notificaciones (Email).
- **Nivel 21-24:** Diseño Visual (Mermaid), GraphQL, **Resiliencia (Circuit Breaker)** y Trazabilidad (Zipkin).
- **Nivel 25-29:** Procesamiento Masivo (**Spring Batch**), Auditoría de Entidades y Pruebas Parametrizadas.

## 🛠️ Requisitos
- **Java 21 LTS** - **Maven 3.8+** - **Docker & Docker Compose**

## 🐳 Ejecución con Docker (Ecosistema Completo)
Para levantar la aplicación junto con todo su ecosistema profesional:
1. Compila el JAR: `mvn clean package -DskipTests`
2. Levanta el ecosistema: `docker-compose up --build`
3. **Endpoints de interés:**
   - App: `http://localhost:8080`
   - Swagger UI: `/swagger-ui/index.html`
   - Prometheus: `http://localhost:9090`
   - Zipkin Tracing: `http://localhost:9411`
   - RabbitMQ Admin: `http://localhost:15672` (guest/guest)

## 🧪 Cómo Usar y Probar el Proyecto

La filosofía de este repositorio es **Interactiva y Basada en Pruebas (TDD)**:

1. **Lee el Enunciado:** Abre la clase `[Nombre]Enunciado.java`. Allí encontrarás la descripción del problema y un método vacío.
2. **Corre el Test:** Ejecuta `[Nombre]Test.java`. Verás que las pruebas fallan (en **rojo**).
3. **Programa:** Implementa la lógica necesaria en la clase `Enunciado`.
4. **Valida:** Corre el test nuevamente. Cuando esté en **verde**, habrás resuelto el reto.
5. **Compara:** Consulta `[Nombre]Solucion.java` para ver mejores prácticas y teoría.

Para ejecutar la suite completa (más de 115 tests):
```bash
mvn clean test
```

---
*Construyendo código sólido, un test a la vez.*
