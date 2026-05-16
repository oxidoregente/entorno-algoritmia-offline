# 🚀 Entorno de Algoritmia Offline - "LeetCode Local"

¡Bienvenido al laboratorio de ingeniería de software interactivo! Este repositorio es un recurso de código abierto diseñado para dominar el ecosistema moderno de Java y Spring Boot a través de un enfoque **100% práctico, offline y autónomo**.

## 🎯 Propósito del Proyecto
Este proyecto permite a desarrolladores de todos los niveles fortalecer su lógica de programación, aprender técnicas de testing profesional y comprender arquitecturas empresariales reales sin depender de plataformas externas. Es ideal para entornos sin conexión o para quienes prefieren la velocidad y potencia de su propio IDE (IntelliJ, VS Code, Eclipse).

---

## 🗺️ Rutas de Aprendizaje Sugeridas

Para facilitar tu progreso, hemos categorizado los niveles en tres rutas de aprendizaje según tu experiencia actual y objetivos:

### 🟢 Ruta 1: Explorador de Lógica (Principiante)
*Enfocada en dominar Java puro, algoritmos y mentalidad de testing.*
- **Nivel 00: Testing Inverso** (Aprende a leer y probar código).
- **Nivel 01: Algoritmia Base** (Arrays, Strings, Recursión).
- **Nivel 02: Java Funcional** (Streams y Lambdas - Esencial para Java moderno).
- **Meta:** Ser capaz de resolver problemas lógicos complejos y escribir código limpio y testeable.

### 🟡 Ruta 2: Constructor de Servicios (Intermedio)
*Enfocada en el ecosistema Spring Boot y arquitectura de aplicaciones.*
- **Nivel 03: Lógica de Negocio** (Servicios e Inyección de Dependencias).
- **Nivel 04: Persistencia JPA** (Bases de datos relacionales y Hibernate).
- **Nivel 05: API REST** (Controladores y estándares HTTP).
- **Nivel 06: Arquitectura Avanzada** (DTOs, Records y Mappers).
- **Nivel 07: Observabilidad AOP** (Programación Orientada a Aspectos).
- **Nivel 16: Gestión de Entornos** (Perfiles de Spring).
- **Meta:** Construir aplicaciones backend robustas, siguiendo patrones de diseño y estándares industriales.

### 🔴 Ruta 3: Arquitecto de Infraestructura y Élite (Profesional)
*Enfocada en sistemas distribuidos, despliegue, seguridad y alto rendimiento.*
- **Nivel 08-11: Ecosistema Docker** (Swagger, Docker, Compose, Testcontainers).
- **Nivel 12-14: Seguridad y Mensajería** (Spring Security, JWT, Redis, RabbitMQ).
- **Nivel 17-21: Evolución y Diseño** (Flyway, Scheduler, WebClient, Mermaid).
- **Nivel 22-32: Tecnologías Avanzadas** (GraphQL, Resilience4j, Batch, WebSockets, Programación Reactiva).
- **Meta:** Diseñar y mantener arquitecturas escalables, resilientes y seguras listas para producción.

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
