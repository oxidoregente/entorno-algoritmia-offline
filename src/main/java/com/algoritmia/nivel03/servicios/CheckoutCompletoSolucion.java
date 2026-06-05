package com.algoritmia.nivel03.servicios;

import com.algoritmia.nivel02.logica.CalculadoraEnviosInternacionalesEnunciado;
import com.algoritmia.nivel02.logica.GestorInventarioEnunciado;
import com.algoritmia.nivel02.logica.GestorInventarioEnunciado.EstatusOrden;
import com.algoritmia.nivel03.servicios.ProcesadorPagosFintechEnunciado.TipoTarjeta;
import org.springframework.context.ApplicationEventPublisher;

import java.util.HashMap;
import java.util.Map;

/**
 * 🏆 SOLUCIÓN: Servicio de Checkout Completo.
 *
 * <p>Teoría:
 * Este servicio es el ejemplo más completo de <b>orquestación de dependencias</b>
 * en Spring. Inyecta 4 beans diferentes: lógica de inventario, envíos,
 * pagos y publicador de eventos. El alumno aprende que un servicio de
 * Spring puede (y suele) componer múltiples responsabilidades de otros
 * servicios en una sola operación de negocio.</p>
 */
public class CheckoutCompletoSolucion {

    private final GestorInventarioEnunciado inventario;
    private final CalculadoraEnviosInternacionalesEnunciado envios;
    private final ProcesadorPagosFintechEnunciado pagos;
    private final ApplicationEventPublisher publicadorEventos;

    public CheckoutCompletoSolucion(GestorInventarioEnunciado inventario,
                                  CalculadoraEnviosInternacionalesEnunciado envios,
                                  ProcesadorPagosFintechEnunciado pagos,
                                  ApplicationEventPublisher publicadorEventos) {
        this.inventario = inventario;
        this.envios = envios;
        this.pagos = pagos;
        this.publicadorEventos = publicadorEventos;
    }

    /**
     * Ejecuta el flujo completo de checkout.
     *
     * @return Mapa con el resumen de la operación.
     */
    public Map<String, Object> checkoutCompleto(int stockActual, int cantidad, boolean esVital,
                                                String zona, double pesoKg, double monto,
                                                TipoTarjeta tipoTarjeta) {
        Map<String, Object> resumen = new HashMap<>();

        EstatusOrden estado = inventario.procesarOrden(stockActual, cantidad, esVital);
        resumen.put("estado", estado.name());

        if (estado == EstatusOrden.PROCESADO_EXITOSO) {
            double costoEnvio = envios.calcularCosto(pesoKg, zona);
            double comision = pagos.calcularComision(monto, tipoTarjeta);

            resumen.put("costoEnvio", costoEnvio);
            resumen.put("comision", comision);

            String mensaje = String.format("Checkout OK - Envío: $%.2f, Comisión: $%.2f",
                                          costoEnvio, comision);
            publicadorEventos.publishEvent(mensaje);
            resumen.put("mensaje", mensaje);
        } else {
            resumen.put("mensaje", "Checkout rechazado: inventario insuficiente");
        }

        return resumen;
    }
}
