# Entorno de Algoritmia Offline - "LeetCode Local"

¡Bienvenido! Este repositorio es un laboratorio de aprendizaje de código abierto diseñado para dominar el ecosistema moderno de Java y Spring Boot de forma 100% práctica y sin conexión a internet. 

El proyecto nació como una iniciativa personal de **Brandon**, estudiante de Ingeniería de Sistemas, en colaboración con inteligencia artificial (Gemini), con el objetivo de crear un entorno de pruebas robusto donde cualquier desarrollador pueda mejorar su lógica de programación, aprender testing y dominar arquitecturas reales sin depender de plataformas web externas.

## 🚀 Estructura de Aprendizaje

El código está dividido en niveles progresivos. Cada ejercicio incluye su propia clase de lógica y su respectiva prueba unitaria (`Test`), documentada exhaustivamente.

1. **Nivel 1: Algoritmia Base (`com.brandon.nivel1`)** -> Lógica pura, estructuras de datos y patrón Arrange-Act-Assert con JUnit 5.
2. **Nivel 2: Java Funcional (`com.brandon.nivel2`)** -> Procesamiento de colecciones con la API de Streams y Lambdas.
3. **Nivel 3: Lógica de Negocio (`com.brandon.nivel3`)** -> Creación de servicios con `@Service` y manejo de reglas empresariales (inyección de dependencias).
4. **Nivel 4: Persistencia JPA (`com.brandon.nivel4`)** -> Base de datos en memoria (H2) con `@Entity`, repositorios y pruebas con `@DataJpaTest`.
5. **Nivel 5: API REST (`com.brandon.nivel5`)** -> Exposición de funcionalidades mediante `@RestController`.
6. **Nivel 6: Arquitectura Avanzada (`com.brandon.nivel6`)** -> Patrones DTO con `records`, manejo de excepciones globales y uso de Mockito.
7. **Nivel 7: Observabilidad y AOP (`com.brandon.nivel7`)** -> Auditoría automática de servicios y monitoreo de tiempos de ejecución.
8. **Nivel 8: Documentación Dinámica (`Swagger/OpenAPI`)** -> Interfaz web interactiva para probar la API en `/swagger-ui/index.html`.
9. **Nivel 9: Dockerización (`Containerization`)** -> Empaquetado profesional para despliegue en cualquier entorno.
10. **Nivel 10: Orquestación (`Docker Compose`)** -> Sistema multi-contenedor con PostgreSQL real.
11. **Nivel 11: Testing de Élite (`Testcontainers`)** -> Pruebas de integración automáticas con Docker.
12. **Nivel 12: Seguridad Industrial (`Spring Security + JWT`)** -> Protección de endpoints y autenticación con tokens.
13. **Nivel 13: Optimización Extrema (`Redis Cache`)** -> Aceleración de respuestas mediante caché distribuido.
14. **Nivel 14: Arquitectura de Eventos (`RabbitMQ`)** -> Comunicación asíncrona entre componentes mediante mensajería.
15. **Nivel 15: Observabilidad 360° (`Actuator + Prometheus`)** -> Monitorización de salud y métricas de rendimiento en tiempo real.
16. **Nivel 16: Gestión de Entornos (`Spring Profiles`)** -> Separación de configuraciones entre desarrollo y producción.
17. **Nivel 17: Evolución de Datos (`Flyway`)** -> Versionado y migración automática de esquemas de base de datos.
18. **Nivel 18: Automatización de Tareas (`Scheduler`)** -> Programación de procesos autónomos en segundo plano.
19. **Nivel 19: Integración Externa (`WebClient`)** -> Consumo de APIs de terceros mediante clientes HTTP reactivos.
20. **Nivel 20: Notificaciones Pro (`Spring Mail`)** -> Flujo completo de avisos automáticos integrados con eventos.
21. **Nivel 21: Diseño Visual (`Mermaid Architecture`)** -> Documentación técnica con diagramas de flujo e infraestructura.
22. **Nivel 22: Consultas Flexibles (`GraphQL`)** -> Alternativa moderna a REST para optimizar el tráfico de datos.
23. **Nivel 23: Resiliencia y Tolerancia (`Circuit Breaker`)** -> Protección del sistema ante fallos en dependencias externas.

## 🛠️ Requisitos
- **Java 21 LTS** - **Maven 3.8+** - **Docker & Docker Compose**

## 🐳 Ejecución con Docker (Ecosistema Completo)
Para levantar la aplicación junto con todo su ecosistema profesional:
1. Compila el JAR: `mvn clean package -DskipTests`
2. Levanta el ecosistema: `docker-compose up --build`
3. **Endpoints de interés:**
   - App: `http://localhost:8080`
   - Swagger: `http://localhost:8080/swagger-ui/index.html`
   - Prometheus: `http://localhost:9090`
   - RabbitMQ Admin: `http://localhost:15672` (usuario/pass: guest)

## 🧪 Cómo Usar y Probar el Proyecto

La filosofía de este repositorio es **Test-Driven**. No necesitas levantar un servidor para probar los algoritmos; todo se ejecuta a través de pruebas automatizadas.

Para ejecutar todos los ejercicios a la vez:
```bash
mvn clean test
```

*Tip para entornos offline:* Si ya ejecutaste el comando anterior una vez con internet, puedes correr todas las pruebas sin conexión añadiendo el flag offline: `mvn clean test -o`.

## 🤝 Cómo Contribuir

¡Las contribuciones son bienvenidas! Si deseas agregar nuevos ejercicios o mejorar las explicaciones teóricas:

1. Haz un Fork del repositorio.
2. Crea una rama para tu ejercicio (`git checkout -b feature/nivelX-nombre-ejercicio`).
3. Asegúrate de incluir el código principal y su test correspondiente en verde.
4. Usa comentarios en formato Javadoc para explicar la teoría detrás de tu solución.
5. Abre un Pull Request detallando qué concepto nuevo aporta tu ejercicio.

---

*Construyendo código sólido, un test a la vez.*
