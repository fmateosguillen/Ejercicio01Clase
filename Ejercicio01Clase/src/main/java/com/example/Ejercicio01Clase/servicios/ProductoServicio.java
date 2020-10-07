package com.example.Ejercicio01Clase.servicios;

import com.example.Ejercicio01Clase.modelo.Producto;
import com.example.Ejercicio01Clase.repos.ProductoRepositorio;
import com.example.Ejercicio01Clase.servicios.base.ServicioBaseImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductoServicio extends ServicioBaseImpl<Producto, Long, ProductoRepositorio> {
    public List<Producto> ProductosEnMayusculas() {
        return this.findAll().stream()
                .map(p -> {
                    return Producto.builder()
                            .id(p.getId())
                            .nombre(p.getNombre().toUpperCase())
                            .cantidad(p.getCantidad())
                            .build();
                }).collect(Collectors.toList());
    }
}
