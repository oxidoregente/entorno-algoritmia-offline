# 🏛️ Arquitectura del Sistema - LeetCode Local

Este documento detalla la estructura técnica de los 21 niveles implementados en el proyecto.

## 🔄 Flujo de Datos Principal
Este diagrama muestra cómo una petición de usuario atraviesa el sistema hasta la notificación final.

```mermaid
sequenceDiagram
    participant U as Usuario
    participant API as PagoController (N5/8)
    participant S as ProcesadorPagos (N3)
    participant Q as RabbitMQ (N14)
    participant C as ConsumidorMensajes (N14)
    participant E as ServicioEmail (N20)

    U->>API: GET /comision
    API->>S: calcularComision()
    S-->>Q: Enviar Evento Auditoría
    S-->>API: Resultado Comisión
    API-->>U: Respuesta JSON
    
    Note over Q,E: Proceso Asíncrono
    Q->>C: Recibir Mensaje
    C->>E: enviarNotificacion()
```

## 🏗️ Ecosistema de Infraestructura (Docker)
Cómo se orquestan los 5 contenedores principales del Nivel 10 al 15.

```mermaid
graph TD
    App[Spring Boot App] --> DB[(PostgreSQL)]
    App --> Redis[(Redis Cache)]
    App --> RMQ[RabbitMQ]
    App --> Act[Actuator Metrics]
    Prom[Prometheus] -->|Scrape| Act
```

## 🛠️ Tecnologías por Nivel
- **Lógica:** Java 21, Streams, Records.
- **Persistencia:** Spring Data JPA, Flyway, PostgreSQL.
- **Comunicación:** REST, WebClient, AMQP.
- **Calidad:** JUnit 5, Mockito, Testcontainers.
- **Ops:** Docker, Docker Compose, GitHub Actions, Prometheus.
