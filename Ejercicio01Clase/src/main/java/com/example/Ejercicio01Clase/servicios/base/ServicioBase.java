package com.example.Ejercicio01Clase.servicios.base;

import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;
import java.util.List;

public interface ServicioBase<T, ID, R extends JpaRepository<T, ID>> {
    T save(T t);
    Optional<T> findById(ID id);
    List<T> findAll();
    T edit(T t);
    void delete(T t);
    void deleteById(ID id);


}
