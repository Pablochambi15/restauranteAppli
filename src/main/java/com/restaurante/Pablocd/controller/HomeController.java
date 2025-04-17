package com.restaurante.Pablocd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";  
    }
    @GetMapping("/menu")
    public String mostrarMenu() {
        return "menu";
    }

    @GetMapping("/galeria")
    public String mostrarGaleria() {
        return "galeria";
    }

    @GetMapping("/pedidos")
    public String mostrarPedidos() {
        return "pedidos";
    }
}