package com.practica.practica.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.practica.practica.models.Contactar;

import jakarta.validation.Valid;

@Controller
public class ContactarController {
    
    @GetMapping({"/","","/index","/form"})
    public String form(Model model) {
        model.addAttribute("titulo", "Formulario");
        model.addAttribute("contactar", new Contactar());
        return "index";
    }

    @PostMapping("/form")
    public String resultado(@Valid Contactar contactar, BindingResult resultado, Model model){
        if(resultado.hasErrors()){
            model.addAttribute("titulo", "Formulario");
            return "index";
        }
        model.addAttribute("titulo", "Restultado formulario");
        return "respuesta";
    }

}
