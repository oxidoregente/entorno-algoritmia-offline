package com.brandon.nivel6.servicios;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.brandon.nivel6.dto.VentaResumenDTO;
import com.brandon.nivel6.servicios.MapperVentaDetalleEnunciado.ItemVenta;

class MapperVentaDetalleTest {

    @Test
    void testMapeoVenta() {
        MapperVentaDetalleEnunciado mapper = new MapperVentaDetalleEnunciado();
        List<ItemVenta> items = List.of(
            new ItemVenta("Laptop", 1000.0),
            new ItemVenta("Mouse", 50.0)
        );

        VentaResumenDTO dto = mapper.mapearAVentaDTO(101L, items);

        assertNotNull(dto);
        assertEquals(1050.0, dto.totalCalculado());
        assertEquals(2, dto.productosConcat().size());
    }
}
