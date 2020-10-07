package com.example.Ejercicio01Clase.controladores;

import com.example.Ejercicio01Clase.modelo.Producto;
import com.example.Ejercicio01Clase.servicios.ProductoServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/producto")
@RequiredArgsConstructor
public class ProductoControlador {
    private final ProductoServicio productoServicio;

    @GetMapping("/")
    public String list(Model model) {
        model.addAttribute("lista", productoServicio.ProductosEnMayusculas());
        return "productos/index";
    }

    @GetMapping("/new")
    public String showFormNewProduct(Model model) {
        model.addAttribute("producto", new Producto());
        return "productos/formulario";
    }

    @PostMapping("/submit")
    public String submitNewProduct(
            @ModelAttribute("producto") Producto producto) {
        productoServicio.save(producto);
        return "redirect:/productos/";
    }

}
