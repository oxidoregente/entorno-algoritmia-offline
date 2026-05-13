# Entorno de Algoritmia Offline - "LeetCode Local"

¡Bienvenido! Este repositorio es un laboratorio de aprendizaje de código abierto diseñado para dominar el ecosistema moderno de Java y Spring Boot de forma 100% práctica y sin necesidad de conexión constante a internet.

El propósito de este proyecto es proporcionar un entorno de pruebas robusto donde cualquier desarrollador pueda fortalecer su lógica de programación, dominar el testing automatizado y comprender arquitecturas empresariales reales a través de retos prácticos y progresivos.

## 🚀 Estructura de Aprendizaje

El código está organizado en niveles cronológicos y técnicos, contando con **más de 80 retos interactivos** (puedes consultar el [Catálogo Completo aquí](CHALLENGES.md)). Cada ejercicio sigue el patrón interactivo de aprendizaje: una clase de reto (`Enunciado`), una referencia optimizada (`Solucion`) y su respectiva prueba unitaria (`Test`).


### 🧩 Fundamentos (Core Java & Spring)
00. **Nivel 00: Testing Inverso** -> Introducción al testing; escribe pruebas para código ya funcional.
01. **Nivel 01: Algoritmia Base** -> Lógica pura, estructuras de datos, árboles binarios y recursión.
02. **Nivel 02: Java Funcional** -> Dominio de la API de Streams, Lambdas y procesamiento de colecciones.
03. **Nivel 03: Lógica de Negocio** -> Creación de servicios con `@Service`, inyección de dependencias y Mocks.
04. **Nivel 04: Persistencia JPA** -> Modelado relacional, Query Methods, relaciones y entidades embebidas.
05. **Nivel 05: API REST** -> Exposición de funcionalidades mediante controladores y estándares HTTP.
06. **Nivel 06: Arquitectura Avanzada** -> Patrones DTO con `records`, mappers y manejo global de excepciones.
07. **Nivel 07: Observabilidad AOP** -> Auditoría automática y aspectos transversales del sistema.

### 🏗️ Infraestructura y Sistemas Distribuidos
- **Nivel 08-11:** Documentación Dinámica (Swagger), Dockerización y Testing con **Testcontainers**.
- **Nivel 12:** Seguridad Industrial con **Spring Security + JWT** (Roles y Autorización).
- **Nivel 13-14:** Optimización con **Redis Cache** y Mensajería Asíncrona con **RabbitMQ**.
- **Nivel 15:** Monitorización Profesional con **Actuator + Prometheus**.
- **Nivel 16-17:** Gestión de Entornos (Spring Profiles) y Evolución de Datos con **Flyway**.
- **Nivel 18-20:** Automatización (Scheduling), Integración Externa (WebClient) y Notificaciones.
- **Nivel 21-24:** Diseño Visual (Mermaid), GraphQL, **Resiliencia (Circuit Breaker)** y Trazabilidad (Zipkin).
- **Nivel 25-32:** Procesamiento Masivo (**Spring Batch**), Auditoría de Entidades, Pruebas Parametrizadas y Orquestación Global.

## 🛠️ Requisitos
- **Java 21 LTS**
- **Maven 3.8+**
- **Docker & Docker Compose** (Para niveles de infraestructura)

## 🐳 Ejecución con Docker (Ecosistema Completo)
Para levantar la aplicación junto con todo su stack tecnológico:
1. Compila el proyecto: `mvn clean package -DskipTests`
2. Levanta los contenedores: `docker-compose up --build`
3. **Servicios disponibles:**
   - **API / App:** `http://localhost:8080`
   - **Swagger UI:** `http://localhost:8080/swagger-ui/index.html`
   - **Prometheus (Métricas):** `http://localhost:9090`
   - **Zipkin (Trazabilidad):** `http://localhost:9411`
   - **RabbitMQ (Mensajería):** `http://localhost:15672` (guest / guest)

## 🧪 Cómo Usar y Probar el Proyecto

El repositorio fomenta el **Desarrollo Basado en Pruebas (TDD)** como método de estudio:

1. **Lee el Enunciado:** Abre la clase `[Nombre]Enunciado.java`. Analiza el problema y el método vacío.
2. **Corre el Test:** Ejecuta la clase `[Nombre]Test.java`. Verás que las pruebas fallan (en **rojo**).
3. **Implementa:** Escribe el código necesario en la clase `Enunciado`.
4. **Valida:** Ejecuta el test nuevamente hasta que esté en **verde**.
5. **Aprende:** Consulta `[Nombre]Solucion.java` para comparar con una implementación Senior y leer la teoría.

Para ejecutar todos los tests (más de 125 pruebas):
```bash
mvn clean test
```

---
## 🤝 Créditos y Autoría
Este proyecto es una iniciativa educativa desarrollada por **Brandon**, estudiante de Ingeniería de Sistemas, en colaboración con inteligencia artificial (Gemini), con el fin de compartir conocimiento técnico de alta calidad con la comunidad de desarrolladores.

---
*Construyendo código sólido, un test a la vez.*
