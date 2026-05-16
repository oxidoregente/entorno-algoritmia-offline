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

### Nivel 16-18: Gestión y Automatización
- **Profiles**: Beans condicionales y negación de perfiles (!).
- **Properties**: Carga de archivos application-{env}.properties.
- **Flyway**: Migraciones versionadas, Repeatable y Baseline.
- **Scheduler**: Tareas fijas, retardadas y dinámicas.

### Nivel 19-21: Integración y Diseño
- **WebClient**: Peticiones GET/POST reactivas y reintentos.
- **Spring Mail**: Envío de HTML profesional y archivos adjuntos.
- **Mermaid**: Documentación visual de arquitectura (C4 Model).

### Nivel 22-24: APIs y Trazabilidad
- **GraphQL**: Query, Mutation y Subscriptions (Real-time).
- **Resilience4j**: Circuit Breaker, Rate Limiter y Bulkhead.
- **Tracing**: Spans personalizados, Baggage y TraceID en logs.

## 🏆 Fase 4: Especialización y Cierre Maestro

### Nivel 25-28: Datos y Simulación
- **Batch**: Procesamiento masivo con lógica de reintento/salto.
- **WebSockets**: Comunicación bidireccional y seguridad en tópicos.
- **Envers**: Auditoría histórica y consultas de revisión complejas.
- **WireMock**: Simulación avanzada de fallos externos y verificación.

### Nivel 29-32: Lógica de Élite
- **JUnit 5**: Pruebas parametrizadas, dinámicas y ordenadas.
- **Orquestación**: Patrones Saga, Outbox y TCC (Transacciones).
- **Reactive**: Operadores de transformación y Backpressure.
- **Proactive Security**: Detectores de Fuerza Bruta, SQLi y XSS.

---
*¿Listo para el desafío? Escoge un nivel del catálogo y empieza a programar.*
