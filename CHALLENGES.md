# 📚 Catálogo de Retos - LeetCode Local

Este laboratorio contiene **más de 150 componentes y retos interactivos** diseñados para cubrir el ciclo completo de vida del desarrollo de software con Java 21 y Spring Boot 3.

## 🟢 Fase 1: Fundamentos y Lógica Core

### Nivel 00: Iniciación al Testing (AAA)
*Aprende a escribir pruebas unitarias para código existente.*
- **Calculadora Financiera**: Interés compuesto.
- **Calculadora Simple**: Sumas básicas.
- **Contador Elementos**: Manejo de nulos en listas.
- **Transformador Texto**: Limpieza de Strings.
- **Validador Rango**: Lógica booleana básica.

### Nivel 01: Algoritmia y Lógica Pura
- **Arrays**: Busqueda Binaria, Contar Islas, Encontrar Duplicado, Invertir Lista Enlazada, Máximo Subarreglo (Kadane), Mover Ceros, Número Faltante, Producto Excepto Propio, Rotar Array, Suma Diagonal, Two Sum.
- **Recursión**: Factorial, Fibonacci, Suma de Dígitos.
- **Strings**: Compresión, Contar Vocales, Anagramas, Invertir Palabras, Invertir Vocales, Palíndromo, Primer Único, Subcadena sin Repetir, Validar Paréntesis.
- **Trees**: Invertir Árbol Binario.

### Nivel 02: Java Funcional (Streams & Lambdas)
- **Transformaciones**: Filtro E-commerce, Calculadora Recetas, Filtro Usuarios, Procesador Pedidos, Unión de Nombres, Filtro Nombres Únicos.
- **Agregaciones**: Estadísticas Números, Estadísticas Ventas, Frecuencia Palabras, Analizador Palabras Frecuentes.
- **Clasificación**: Agrupador Jerárquico, Agrupador Monto Ventas, Agrupador Rangos Edad, Filtro Ciudades, Buscador Empleados, Buscador Iniciales, Filtro Primos.
- **Utilidades**: Calculadora IVA, Analizador Logs.

### Nivel 03: Lógica de Negocio (Spring Services)
- **Fintech**: Procesador Pagos, Validador Fraude, Calculadora Lealtad, Calculadora Suscripción, Conversor Monedas, Generador Referencia.
- **Logística**: Calculadora Envíos Internacionales.
- **Juegos**: Motor Roguelike, Movimientos Ajedrez.
- **Orquestación**: Orquestador Pedidos.
- **Validación**: Validador Email, Validador Inscripciones, Validador Seguridad Pass.

### Nivel 04: Persistencia Relacional (Spring Data JPA)
- **Entidades**: Cliente, Coche, Curso, Empresa, Estudiante, Item, Jugador, Pedido, Producto, Proyecto, Tarea, Ticket, Transacción, Usuario.
- **Consultas**: Búsquedas por atributos, TopN (Rankings), Rangos de fecha, Filtros complejos, Relaciones @ManyToOne, Atributos @Embedded.

### Nivel 05: API REST (Controladores)
- **Básicos**: Ping, Hola Mundo.
- **Operaciones CRUD**: Inventario, Pagos.
- **Cálculos**: MatematicasController con operaciones vía GET/POST.

### Nivel 06: Arquitectura Avanzada (DTOs y Mappers)
- **DTOs**: Cliente, Producto, Transaccion con records de Java 21.
- **Mappers**: Mapeo de entidades a DTOs y viceversa.
- **Validación**: Reglas de negocio y manejo de excepciones global.
- **Orquestación**: Historial de transacciones con múltiples servicios.

### Nivel 07: Observabilidad con AOP (Aspectos)
- **Logging**: Logger automático de métodos mediante aspectos.
- **Rendimiento**: Medición de tiempo de ejecución con @Around.
- **Validación**: Interceptor de argumentos inválidos.
- **Auditoría**: Registro de accesos a métodos críticos.
- **Errores**: Manejo centralizado de excepciones con aspectos.

## 🏗️ Fase 2: Infraestructura y Modernización

### Nivel 08: Documentación Dinámica (Swagger)
- **Swagger Básico**: Configuración inicial de OpenAPI.
- **Metadatos**: Personalización de Título, Versión y Descripción.
- **Seguridad**: Integración de esquemas JWT (Bearer).
- **Grupos**: Aislamiento de APIs Públicas vs Privadas.
- **Schemas**: Anotaciones para modelos de datos (Records).

### Nivel 09: Dockerización (Dockerfile)
- **Base**: Imágenes ligeras de Java 21 (Slim).
- **Multi-Etapa**: Optimización de compilación con Maven.
- **Seguridad**: Ejecución como usuario no-root.
- **Healthcheck**: Monitoreo nativo desde Docker.
- **Labels**: Gestión de metadatos de autoría.

### Nivel 10: Orquestación (Docker Compose)
- **Full Stack**: Conexión App + PostgreSQL.
- **Persistencia**: Gestión de Volúmenes externos.
- **Redes**: Aislamiento mediante Docker Networks.
- **Dependencias**: Orden de inicio con Healthchecks.
- **Entornos**: Inyección de secretos vía archivos .env.

### Nivel 11: Testing de Élite (Testcontainers)
- **Postgres**: Base de datos real en tiempo de ejecución.
- **Redis**: Validación de caché distribuido.
- **RabbitMQ**: Pruebas de integración de colas.
- **Propiedades**: Inyección dinámica con @DynamicPropertySource.
- **Optimización**: Reutilización de contenedores (Singleton).

### Nivel 12: Seguridad Industrial (Spring Security)
- **Auth Flow**: Implementación de Login y JWT.
- **Cifrado**: Uso de BCryptPasswordEncoder.
- **Tokens**: Generación y validación de Claims.
- **Config**: Cadena de filtros y protección de rutas.
- **UserDetailsService**: Carga personalizada de perfiles.

### Nivel 13: Optimización con Redis (Cache)
- **Cacheable**: Almacenamiento declarativo de perfiles.
- **Manual**: Uso de RedisTemplate para tipos complejos.
- **Eviction**: Invalidación selectiva y total de caché.
- **Conditional**: Lógica SpEL para cacheo inteligente.
- **CachePut**: Sincronización proactiva de datos.

### Nivel 14: Arquitectura de Eventos (RabbitMQ)
- **Producer**: Envío de mensajes a Exchanges.
- **Consumer**: Procesamiento asíncrono con @RabbitListener.
- **Prioridad**: Filtrado de mensajes críticos.
- **Reenvío**: Lógica de puente entre colas.
- **DLQ**: Manejo de mensajes fallidos (Dead Letter).

### Nivel 15: Monitorización 360° (Actuator)
- **Health**: Diagnóstico de servicios externos.
- **Metrics**: Contadores personalizados con Micrometer.
- **Info**: Exposición de metadatos de autoría.
- **Endpoints**: Creación de puntos de control propios.
- **Prometheus**: Integración de métricas para Scraping.

## ⚡ Fase 3: Ingeniería de Avanzada y Resiliencia

### Nivel 16: Gestión de Entornos (Spring Profiles)
- **Profiles**: Beans condicionales y negación de perfiles (!).
- **Properties**: Carga de archivos application-{env}.properties.
- **Extra**: Integración con propiedades personalizadas y tests.

### Nivel 17: Migraciones de Base de Datos (Flyway)
- **Baseline**: Inicialización de migraciones sobre bases existentes.
- **Versionado**: Migraciones con naming convencional y repetible.
- **Callbacks**: Ejecución de lógica antes/después de migrar.
- **Verificación**: Estado y validación de migraciones aplicadas.

### Nivel 18: Automatización de Tareas (Scheduler)
- **Fijo vs Tasa**: Diferencia entre fixedDelay y fixedRate.
- **Dinámico**: Programación de tareas en tiempo de ejecución.
- **Mantenimiento**: Backup diario y verificación de conexión.

### Nivel 19: Clientes HTTP Reactivos (WebClient)
- **GET/POST**: Consultas y envíos a servicios externos.
- **Reintentos**: Política de retry con backoff.
- **Avanzado**: Búsqueda de repositorios y tasas de cambio.

### Nivel 20: Notificaciones (Spring Mail)
- **Bienvenida**: Emails transaccionales con templates.
- **Adjuntos**: Envío de archivos adjuntos.
- **Alertas**: Notificaciones de saldo bajo y templates HTML.

### Nivel 21: Diagramas de Arquitectura (Mermaid)
- **Diagramas de Flujo**: Procesos y algoritmos.
- **Diagramas de Clase**: Modelado de dominio y relaciones.
- **Secuencia**: Interacciones entre componentes.
- **Gantt**: Planificación temporal de tareas.
- **Gráficos**: Visualización de datos y métricas.

### Nivel 22: APIs Modernas (GraphQL)
- **Query**: Consultas con filtros y proyecciones.
- **Mutation**: Operaciones de escritura (cálculo de IVA).
- **Filtros**: Búsqueda por rangos de monto.

### Nivel 23: Resiliencia (Resilience4j)
- **Circuit Breaker**: Protección contra fallos en cascada.
- **Rate Limiter**: Control de tasa de peticiones.
- **Bulkhead**: Aislamiento de recursos por concurrencia.

### Nivel 24: Trazabilidad Distribuida (Tracing)
- **Spans Personalizados**: Creación de trazas con Micrometer.
- **Baggage**: Propagación de metadatos entre servicios.
- **Async**: Trazado en operaciones asíncronas.
- **Filtros**: Extracción de TraceID en logs.

## 🏆 Fase 4: Especialización y Cierre Maestro

### Nivel 25: Procesamiento Masivo (Spring Batch)
- **Processor**: Transformación de datos con ItemProcessor.
- **Reintentos**: Saltos y reintentos en fallos de chunks.
- **Importación**: Carga masiva de clientes desde CSV.

### Nivel 26: Comunicación Bidireccional (WebSockets)
- **Configuración**: Handshake y registro de interceptores.
- **Broadcast**: Envío de mensajes a todos los suscriptores.
- **Seguridad**: Autenticación y autorización en tópicos.
- **Notificador**: Servicio de notificaciones push.

### Nivel 27: Auditoría Histórica (Hibernate Envers)
- **Entidades Auditables**: Seguimiento de cambios @Audited.
- **Usuario**: Registro del usuario que realizó cada cambio.
- **Consultas**: Búsquedas complejas de revisiones.
- **Consultor**: Servicio de consulta de auditoría.

### Nivel 28: Simulación de Fallos (WireMock)
- **Básico**: Stubs de respuestas HTTP simuladas.
- **Fallos**: Simulación de timeouts y errores 5xx.
- **Prioridad**: Jerarquía de reglas de stub.
- **Dinámico**: Respuestas basadas en request matching.
- **Verificación**: Validación de interacciones realizadas.

### Nivel 29: Testing Avanzado (JUnit 5)
- **Parametrizado**: Tests con CSV y Enum sources.
- **Dinámico**: Generación de tests en tiempo de ejecución.
- **Orden**: Ejecución controlada de casos de prueba.

### Nivel 30: Patrones de Orquestación (Saga y Outbox)
- **Saga**: Transacciones distribuidas con compensación.
- **Outbox**: Patrón de escritura en tabla de eventos.
- **Composición**: Agregación de respuestas de múltiples APIs.

### Nivel 31: Programación Reactiva (Project Reactor)
- **Mono/Zip**: Combinación de resultados asíncronos.
- **Flux**: Transformaciones con operadores reactivos.
- **Backpressure**: Control de contrapresión.
- **Errores**: Manejo reactivo de excepciones.

### Nivel 32: Seguridad Proactiva
- **Fuerza Bruta**: Detector de intentos fallidos de login.
- **CSRF**: Configuración avanzada de protección.
- **Intrusos**: Sistema de detección de accesos sospechosos.

---
*¿Listo para el desafío? Escoge un nivel del catálogo y empieza a programar.*
