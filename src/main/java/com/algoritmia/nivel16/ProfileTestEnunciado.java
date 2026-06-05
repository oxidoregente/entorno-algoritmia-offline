package com.algoritmia.nivel16;

import org.springframework.test.context.ActiveProfiles;

/**
 * 🎓 RETO: Pruebas con Perfiles Específicos.
 * <b>Dificultad: Fácil</b>
 *
 * <p>En los tests es indispensable poder predecir el entorno:
 * no queremos que un test dependa del perfil configurado en
 * la máquina del desarrollador o en el CI. La anotación
 * {@code @ActiveProfiles} fuerza un perfil concreto durante
 * la ejecución de la prueba, aislando el comportamiento y
 * garantizando que se carguen los beans apropiados (por
 * ejemplo, el {@code dataSourceDev} en lugar del {@code dataSourceProd}).</p>
 *
 * <p><b>Reglas / Estructura / Conceptos clave:</b></p>
 * <ul>
 *   <li>{@code @ActiveProfiles} se coloca a nivel de clase de test
 *       (en {@code src/test/java/}) y acepta uno o varios perfiles.</li>
 *   <li>Funciona tanto con {@code @SpringBootTest} (test de integración) como
 *       con tests más ligeros con {@code @ExtendWith(SpringExtension.class)}.</li>
 *   <li>Si varios perfiles están activos, todos sus beans se cargan; usa perfiles
 *       disjuntos para evitar colisiones.</li>
 * </ul>
 *
 * <h3>Ejemplo:</h3>
 * <pre>
 * &#64;SpringBootTest
 * &#64;ActiveProfiles("dev")
 * class ProfileTestEnunciado {
 *     &#64;Autowired
 *     private String dataSourceDev;
 *
 *     &#64;Test
 *     void cargaDataSourceDeDev() {
 *         assertEquals("H2-Memory-Database", dataSourceDev);
 *     }
 * }
 * </pre>
 *
 * <h3>Pistas:</h3>
 * <ul>
 *   <li>Combina con {@code @TestPropertySource(properties = "app.mensaje=test")} para
 *       sobreescribir valores concretos durante la prueba.</li>
 *   <li>Recuerda que la anotación solo afecta a la clase de test donde se declara, no
 *       al resto del proyecto.</li>
 * </ul>
 */
@ActiveProfiles("test")
public class ProfileTestEnunciado {
    // TODO: Crea una clase de test en src/test/java que use @ActiveProfiles("dev")
    // y verifique que el bean dataSourceDev es cargado correctamente.
}
