package com.practica.practica.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.practica.practica.models.Contactar;

@Controller
public class ContactarController {
    
    @GetMapping({"/","","/index","/form"})
    public String form(Model model) {
        model.addAttribute("titulo", "Formulario");
        model.addAttribute("contactar", new Contactar());
        return "index";
    }

    @PostMapping("/form")
    public String resultado(Contactar contactar, Model model){
        model.addAttribute("titulo", "Restultado formulario");
        return "respuesta";
    }

}
