package com.saludo.practica_spring.clase1.ej1.controllers;

import com.saludo.practica_spring.clase1.ej1.entities.RomanNumberConverter;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/converter")
public class NumberConverterController {

    @GetMapping(value = {"/romanNumber/{intNumber}", "/romanNumber"})
    public String convertToRoman(@PathVariable(required = false) Integer intNumber) {

        if (intNumber != null) {
            final RomanNumberConverter converter = new RomanNumberConverter();
            return converter.convertIntToRoman(intNumber);
        } else {
            return "No number was provided!";
        }
    }

    @ExceptionHandler(NumberFormatException.class)
    public String exceptionHandler() {
        return "Please, enter a valid argument";
    }

}
