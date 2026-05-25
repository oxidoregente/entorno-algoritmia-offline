# 🚀 Entorno de Algoritmia Offline - "LeetCode Local"

¡Bienvenido al laboratorio de ingeniería de software interactivo! Este repositorio es un recurso de código abierto diseñado para dominar el ecosistema moderno de Java y Spring Boot a través de un enfoque **100% práctico, offline y autónomo**.

> **Nota para usuarios nuevos en Java:** Este proyecto asume que conoces lo básico de Java (variables, tipos de datos, bucles, métodos). Si apenas estás comenzando, consulta la sección de [Recursos de Aprendizaje](#-recursos-de-aprendizaje) al final de este documento.

---

## 📖 Introducción al Proyecto

### ¿Qué es "LeetCode Local"?

Es un entorno de práctica de algoritmia y arquitectura de software donde resuelves ejercicios organizados en **33 niveles progresivos** (nivel00 a nivel32), cada uno enfocando una tecnología o concepto específico de Java/Spring Boot.

**Características principales:**
- 🌱 **Enfoque TDD:** Cada ejercicio tiene tests que guían tu solución
- 🏠 **100% Offline:** No necesitas internet ni plataformas externas
- 🛠️ **Stack Real:** Usa herramientas profesionales (Maven, Spring Boot, JPA, Docker)
- 📚 **Documentación Incremental:** Cada ejercicio incluye teoría, ejemplos y pistas

**Estructura de un ejercicio:**
```
nivel01/arrays/
├── TwoSumEnunciado.java    ← Aquí escribes tu solución
├── TwoSumTest.java         ← Test que valida tu código
└── TwoSumSolucion.java     ← Solución de referencia (compara al final)
```

---

## 🏁 Guía de Inicio Rápido (Desde Cero)

### 1. Clona el repositorio

```bash
git clone https://github.com/tu-usuario/entorno-algoritmia-offline.git
cd entorno-algoritmia-offline
```

### 2. Verifica tu entorno

```bash
# Verifica Java (debe mostrar versión 21.x)
java -version

# Verifica Maven
mvn --version

# Verifica Docker (opcional, solo si quieres servicios completos)
docker --version
```

> ⚠️ **Importante:** Si tienes Java 17 y el proyecto no compila, configura `JAVA_HOME`:
> - Windows: `$env:JAVA_HOME = "C:\Program Files\Eclipse Adoptium\jdk-21.0.11.10-hotspot"`
> - Linux/Mac: `export JAVA_HOME=/ruta/a/jdk-21`

### 3. Tu primer ejercicio

```bash
# Compila el proyecto
mvn clean compile

# Ejecuta un test específico (ej: nivel00)
mvn test -Dtest=CalculadoraSimpleTest

# Verás que falla (ROJO) - ¡ese es el punto!
# Ahora implementa en el archivo Enunciado.java
# Vuelve a ejecutar el test (debe pasar a VERDE)
```

---

## 🛠️ Configuración por IDE

### IntelliJ IDEA (Recomendado)

1. **Importar proyecto:**
   - File → Open → Selecciona la carpeta del proyecto
   - Selecciona "Import as Maven project"

2. **Configurar JDK 21:**
   - File → Project Structure → Project SDK → Add JDK → Busca `jdk-21`

3. **Ejecutar un test:**
   - Haz clic derecho en el archivo `*Test.java` → Run

4. ** keyboard shortcuts útiles:**
   - `Ctrl + Shift + F10` - Ejecutar test/clase actual
   - `Ctrl + Shift + T` - Ir al test correspondiente
   - `Ctrl + N` - Buscar clase

### VS Code

1. **Extensiones necesarias:**
   - `Extension Pack for Java` (Microsoft)
   - `Maven for Java`

2. **Abrir proyecto:**
   - File → Open Folder → Selecciona el proyecto

3. **Ejecutar tests:**
   - Panel lateral → Maven → Expandir → test

4. **keyboard shortcuts:**
   - `Ctrl+Shift+P` → "Java: Run Test" o "Debug Test"
   - `F5` - Depurar

### Eclipse

1. **Importar:**
   - File → Import → Maven → Existing Maven Projects
   - Browse → Selecciona la carpeta

2. **JDK 21:**
   - Window → Preferences → Java → Installed JREs → Add → Standard VM
   - Busca tu JDK 21

3. **Ejecutar test:**
   - Click derecho en test → Run As → JUnit Test

4. **Atajos útiles:**
   - `Ctrl+Shift+T` - Buscar tipo
   - `F11` - Ejecutar
   - `Ctrl+Space` - Autocompletar

### NetBeans

1. **Abrir proyecto:**
   - File → Open Project → Selecciona la carpeta

2. **JDK 21:**
   - Tools → Java Platforms → Add Platform → Standard JDK
   - Proyecto → Properties → Build → Compile → Selecciona JDK 21

3. **Ejecutar:**
   - Click derecho en proyecto → Test

### Vim / NeoVim

1. **Plugins recomendados:**
   - `Coc.nvim` o `nvim-lspconfig` (LSP)
   - `vim-test` (ejecutar tests)

2. **Configuración básica (vim):**
   ```vim
   " .vimrc
   set wildmenu
   set conceallevel=0
   let g:test#java#maven#executable = 'mvn'
   nmap <leader>t :TestNearest<CR>
   nmap <leader>T :TestFile<CR>
   ```

3. **Ejecutar tests:**
   - `:TestNearest` - Ejecuta el test bajo el cursor
   - `:TestFile` - Ejecuta todos los tests del archivo

4. **Build:**
   - `:!mvn clean compile`

---

## 📚 Prerrequisitos y Conocimientos Esperados

### Lo que DEBES saber antes de empezar:

| Concepto | Nivel esperado |
|----------|----------------|
| Variables y tipos | Declaración, tipos primitivos, Wrapper classes |
| Control de flujo | `if/else`, `switch`, `for`, `while` |
| Métodos | Crear, sobrecargar, retorno de valores |
| POO básica | Clases, objetos, constructores, modificadores |
| Arrays | Crear, acceder, iterar |

### Lo que APRENDERÁS en el proyecto:

- ✅ Testing con JUnit 5 (patrón AAA)
- ✅ Programación funcional (Lambdas, Streams)
- ✅ Spring Boot (Services, Controllers, Repositories)
- ✅ Persistencia con JPA/Hibernate
- ✅ APIs REST y Documentación con Swagger
- ✅ Seguridad con Spring Security y JWT
- ✅ Contenedores con Docker
- ✅ Y mucho más...

### ¿No sabes algo de la lista inicial?

¡No te preocupes! Puedes aprenderlo en paralelo. Aquí tienes recursos recomendados:

---

## 📌 Recursos de Aprendizaje

### Tutoriales en Español (recomendados)

| Recurso | Enfoque | Enlace |
|---------|---------|--------|
| **Tutoriales Programación Ya** | Java desde cero, muy claro y progresivo | [tutorialesprogramacionya.com](https://www.tutorialesprogramacionya.com/) |
| **Aprende Java** | Ejercicios prácticos paso a paso | [aprendejava.online](https://aprendejava.online/) |
| **Codea (Platzi)** | Videoclases y proyectos | [platzi.com/cursos/java](https://platzi.com/cursos/java/) |

### Cursos en Inglés (avanzados)

| Recurso | Enfoque | Enlace |
|---------|---------|--------|
| **Codecademy Java** | Interactivo | [codecademy.com](https://www.codecademy.com/learn/learn-java) |
| **Oracle Java Tutorials** | Oficial | [docs.oracle.com/javase/tutorial](https://docs.oracle.com/javase/tutorial/) |
| **Baeldung** | Spring Boot avanzado | [baeldung.com](https://www.baeldung.com/) |

### Práctica de Algoritmia

| Recurso | Enfoque | Enlace |
|---------|---------|--------|
| **LeetCode** | Desafíos algorítmicos | [leetcode.com](https://leetcode.com/) |
| **HackerRank** | Practica lógica | [hackerrank.com](https://www.hackerrank.com/domains/tutorials/10-days-of-java) |

---

## 🗺️ Rutas de Aprendizaje Sugeridas

Para facilitar tu progreso, hemos categorizado los niveles en cuatro rutas de aprendizaje progresivas, ordenadas por dificultad:

### 🟢 Ruta 1: Explorador de Lógica (Principiante)
*Enfocada en dominar Java puro, algoritmos y mentalidad de testing.*
- **Nivel 00:** Testing Inverso (Aprende a escribir tests unitarios partiendo del código ya implementado).
- **Nivel 01:** Algoritmia Base (Arrays, Strings, Recursión).
- **Nivel 02:** Java Funcional (Streams y Lambdas).
- **Meta:** Resolver problemas lógicos y escribir código limpio y testeable.

### 🟡 Ruta 2: Constructor de Servicios (Intermedio)
*Enfocada en el ecosistema Spring Boot y arquitectura de aplicaciones.*
- **Nivel 03:** Lógica de Negocio (Servicios e Inyección de Dependencias).
- **Nivel 04:** Persistencia JPA (Bases de datos relacionales y Hibernate).
- **Nivel 05:** API REST (Controladores y estándares HTTP).
- **Nivel 06:** Arquitectura Avanzada (DTOs, Records y Mappers).
- **Nivel 07:** Observabilidad AOP (Programación Orientada a Aspectos).
- **Meta:** Construir aplicaciones backend robustas con patrones de diseño industriales.

### 🔴 Ruta 3: Arquitecto de Infraestructura (Profesional)
*Enfocada en contenedores, seguridad, mensajería y monitorización.*
- **Nivel 08:** Documentación Dinámica (Swagger/OpenAPI).
- **Nivel 09:** Dockerización (Dockerfile y multi-etapa).
- **Nivel 10:** Orquestación (Docker Compose).
- **Nivel 11:** Testing de Élite (Testcontainers).
- **Nivel 12:** Seguridad Industrial (Spring Security y JWT).
- **Nivel 13:** Optimización con Redis (Caché).
- **Nivel 14:** Arquitectura de Eventos (RabbitMQ).
- **Nivel 15:** Monitorización 360° (Actuator y Prometheus).
- **Meta:** Diseñar sistemas escalables, resilientes y listos para producción.

### ⚫ Ruta 4: Ingeniería de Élite (Avanzado)
*Enfocada en automatización, integración, trazabilidad y especialización.*
- **Nivel 16:** Gestión de Entornos (Perfiles y Properties de Spring).
- **Nivel 17:** Migraciones de Base de Datos (Flyway).
- **Nivel 18:** Automatización (Scheduler y tareas programadas).
- **Nivel 19:** Clientes HTTP Reactivos (WebClient).
- **Nivel 20:** Notificaciones (Spring Mail).
- **Nivel 21:** Diagramas de Arquitectura (Mermaid).
- **Nivel 22:** APIs Modernas (GraphQL).
- **Nivel 23:** Resiliencia (Resilience4j).
- **Nivel 24:** Trazabilidad Distribuida (Tracing y Zipkin).
- **Nivel 25:** Procesamiento Masivo (Spring Batch).
- **Nivel 26:** Comunicación Bidireccional (WebSockets).
- **Nivel 27:** Auditoría Histórica (Hibernate Envers).
- **Nivel 28:** Simulación de Fallos (WireMock).
- **Nivel 29:** Testing Avanzado (JUnit 5 Dinámico y Parametrizado).
- **Nivel 30:** Patrones de Orquestación (Saga y Outbox).
- **Nivel 31:** Programación Reactiva (Project Reactor).
- **Nivel 32:** Seguridad Proactiva (Detección de Intrusos y CSRF).
- **Meta:** Dominar arquitecturas distribuidas, reactivas y seguras a escala empresarial.

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