package com.example.Ejercicio01Clase.repos;

import com.example.Ejercicio01Clase.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductoRepositorio extends JpaRepository<Producto, Long> {

}
