# Guía para Agentes - Entorno de Algoritmia Offline

Este documento contiene información crucial para que los agentes de OpenCode trabajen eficientemente en este repositorio, evitando errores y acelerando la adaptación.

## 🛠 Comandos Esenciales

*   **Compilar Proyecto (saltando tests):** `mvn clean package -DskipTests`
    *   *Uso:* Necesario antes de levantar la infraestructura con Docker, ya que los tests completos dependen de ella.
*   **Levantar Servicios de Infraestructura (Docker):** `docker-compose up -d`
    *   *Requisito:* Docker debe estar instalado y ejecutándose.
*   **Ejecutar Todos los Tests:** `mvn -B clean test`
    *   *Verificación:* Este comando es usado en el flujo de CI.
*   **Ejecutar Test Individual:** `mvn test -Dtest=[NombreDelTest]`
    *   *Ejemplo:* Para `MiClaseTest.java`, usar `mvn test -Dtest=MiClaseTest`.

## 🏛 Arquitectura y Convenciones

*   **Tecnología Principal:** Java y Spring Boot con Maven.
*   **Propósito:** Repositorio de práctica de algoritmia y desarrollo con Spring Boot, enfocado en un flujo de trabajo TDD (Test-Driven Development).
*   **Estructura de Ejercicios:**
    *   Los retos se organizan en paquetes por nivel (ej. `src/main/java/com/algoritmia/nivel01/arrays`).
    *   Cada reto incluye:
        *   `[Nombre]Enunciado.java`: Donde se debe implementar la solución.
        *   `[Nombre]Test.java`: El archivo de pruebas asociado.
        *   `[Nombre]Solucion.java`: Una solución de referencia.
*   **Requisito de Docker:** La ejecución de la suite completa de tests y el ecosistema de servicios (Postgres, Redis, RabbitMQ, etc.) dependen de Docker y `docker-compose`.
*   **Versión de Java:** El proyecto requiere **Java 21**.

## 🔄 Flujo de Trabajo TDD

El flujo de trabajo estándar para abordar un reto es:

1.  **Selecciona un Reto:** Navega al paquete correspondiente (ej: `nivel01.arrays`).
2.  **Lee la Documentación:** Revisa los Javadocs en `[Nombre]Enunciado.java` para entender el problema.
3.  **Corre el Test:** Ejecuta `[Nombre]Test.java` y espera que falle (Rojo).
4.  **Implementa:** Escribe tu código en `[Nombre]Enunciado.java`.
5.  **Refactoriza y Valida:** Vuelve a ejecutar el test hasta que pase (Verde).
6.  **Compara:** Revisa `[Nombre]Solucion.java` para ver una implementación de referencia.
