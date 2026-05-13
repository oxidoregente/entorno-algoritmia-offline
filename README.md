# Entorno de Algoritmia Offline - "LeetCode Local"

¡Bienvenido al laboratorio de ingeniería de software interactivo! Este repositorio es un recurso de código abierto diseñado para dominar el ecosistema moderno de Java y Spring Boot a través de un enfoque 100% práctico y autónomo.

Este proyecto permite a desarrolladores de todos los niveles fortalecer su lógica de programación, aprender técnicas de testing profesional y comprender arquitecturas empresariales reales sin depender de plataformas externas.

## 🚀 Estructura de Aprendizaje Progresiva

El laboratorio está organizado en **32 niveles técnicos** que contienen **más de 140 retos interactivos**. Cada ejercicio sigue el patrón interactivo de aprendizaje: una clase de reto (`Enunciado`), una referencia optimizada (`Solucion`) y su respectiva prueba unitaria (`Test`) para validar el progreso.

### 🧩 Fase 1: Fundamentos (Core Java & Spring)
00. **Nivel 00: Testing Inverso** -> Introducción al testing; escribe pruebas para código ya funcional.
01. **Nivel 01: Algoritmia Base** -> Lógica pura, estructuras de datos, árboles binarios y recursión.
02. **Nivel 02: Java Funcional** -> Dominio de la API de Streams, Lambdas y procesamiento de colecciones.
03. **Nivel 03: Lógica de Negocio** -> Creación de servicios con `@Service`, inyección de dependencias y Mocks.
04. **Nivel 04: Persistencia JPA** -> Modelado relacional, Query Methods, relaciones y entidades embebidas.
05. **Nivel 05: API REST** -> Exposición de funcionalidades mediante controladores y estándares HTTP.
06. **Nivel 06: Arquitectura Avanzada** -> Patrones DTO con `records`, mappers y manejo global de excepciones.
07. **Nivel 07: Observabilidad AOP** -> Auditoría automática y aspectos transversales del sistema.

### 🏗️ Fase 2: Infraestructura y Sistemas Distribuidos
- **Documentación y Despliegue:** OpenAPI/Swagger, Dockerización y orquestación multi-contenedor con Docker Compose.
- **Calidad de Élite:** Testing de integración real con **Testcontainers** y simulación de APIs con **WireMock**.
- **Seguridad:** Protección industrial con **Spring Security + JWT** (Roles y Autorización).
- **Optimización:** Gestión de caché distribuido con **Redis**.
- **Mensajería:** Arquitectura orientada a eventos con **RabbitMQ (AMQP)**.
- **Monitorización:** Observabilidad 360° con **Spring Boot Actuator + Prometheus**.
- **Evolución:** Gestión de entornos (Profiles) y migraciones de base de datos con **Flyway**.
- **Avanzado:** Tareas programadas (Scheduler), Clientes HTTP reactivos (WebClient), GraphQL y procesamiento masivo con **Spring Batch**.

## 🛠️ Requisitos del Sistema
- **Java 21 LTS** (Uso intensivo de Records, Switch mejorado y Pattern Matching).
- **Maven 3.8+**.
- **Docker & Docker Compose** (Necesario para los niveles de infraestructura y bases de datos reales).

## 🐳 Ejecución con Docker (Full Stack)
Para levantar el ecosistema completo de microservicios y herramientas de monitoreo:
1. Compila el binario: `mvn clean package -DskipTests`
2. Inicia los servicios: `docker-compose up --build`
3. **Panel de Control del Laboratorio:**
   - **API Principal:** `http://localhost:8080`
   - **Documentación Swagger:** `/swagger-ui/index.html`
   - **Métricas Prometheus:** `http://localhost:9090`
   - **Trazabilidad Zipkin:** `http://localhost:9411`
   - **Consola RabbitMQ:** `http://localhost:15672` (guest/guest)

## 🧪 Metodología de Estudio (TDD Flow)

Este repositorio funciona como un "entrenador personal" de código. El flujo recomendado es:

1. **Selecciona un Reto:** Navega por los niveles y abre una clase `[Nombre]Enunciado.java`.
2. **Falla Primero:** Ejecuta su correspondiente `[Nombre]Test.java`. La prueba fallará en **rojo**.
3. **Codifica:** Implementa la lógica solicitada en la clase `Enunciado`.
4. **Verifica:** Corre el test nuevamente hasta obtener el **verde**.
5. **Compara y Mejora:** Abre `[Nombre]Solucion.java` para estudiar una implementación Senior y profundizar en la teoría.

Para ejecutar la suite completa de validación:
```bash
mvn clean test
```

---
## 🤝 Créditos y Autoría
Este laboratorio es una iniciativa educativa desarrollada por **Brandon**, estudiante de Ingeniería de Sistemas, en colaboración con inteligencia artificial (Gemini). El objetivo es democratizar el acceso a arquitecturas de software de alta calidad y fomentar las mejores prácticas de desarrollo en la comunidad.

---
*Construyendo código sólido, un test a la vez.*
