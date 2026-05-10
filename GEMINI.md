# Directrices del Proyecto - Algoritmia Offline

Este archivo contiene los estándares técnicos y convenciones adoptadas para este repositorio.

## 🏗️ Arquitectura
- **Capas:** Se sigue el patrón clásico de `Controller -> Service -> Repository`.
- **DTOs:** No se exponen entidades JPA en la capa de API. Se utilizan `records` de Java 21 para el transporte de datos.
- **Excepciones:** Las validaciones de negocio deben lanzar excepciones personalizadas (ver `com.brandon.nivel6.excepciones`).

## 💻 Estándares de Código
- **Lenguaje:** Java 21 LTS.
- **Nomenclatura:**
    - Variables y comentarios: Español (con fines pedagógicos).
    - Estructura: `camelCase` para variables y métodos, `PascalCase` para clases.
- **Inyección de Dependencias:** Siempre usar inyección por constructor. Evitar `@Autowired` sobre atributos.

## 🧪 Estrategia de Testing
- **Unitarios:** Uso de JUnit 5 y Mockito para servicios.
- **Integración:** Uso de `@DataJpaTest` con base de datos H2 para repositorios.
- **Patrón:** Seguir siempre el esquema **Arrange-Act-Assert**.

## 🛠️ Herramientas
- **Build Tool:** Maven.
- **DB:** H2 (In-memory) para desarrollo local y testing.
- **Server:** Embedded Tomcat (vía Spring Boot).
