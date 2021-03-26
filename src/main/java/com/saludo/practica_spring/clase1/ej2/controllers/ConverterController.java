package com.saludo.practica_spring.clase1.ej2.controllers;

import com.saludo.practica_spring.clase1.ej2.entities.IdiomConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/idiomConverter")
public class ConverterController {

    private final IdiomConverter converter = new IdiomConverter();

    @GetMapping(value = {"/toEnglish/{morse}", "/toEnglish"})
    public String morseToEnglish(@PathVariable(required = false) String morse) {
        return converter.morseToEnglish(morse);
    }

}
