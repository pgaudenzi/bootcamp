package com.saludo.practica_spring.clase2.calculadora_metros.controllers;

import com.saludo.practica_spring.clase2.calculadora_metros.dtos.CasaDTO;
import com.saludo.practica_spring.clase2.calculadora_metros.services.CalculoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/obtener")
public class CalculadoraMetrosController {

    @PostMapping("/metrosCuadrados")
    public ResponseEntity calcular(@RequestBody CasaDTO casaDTO) {
        return new ResponseEntity(CalculoService.calcularDatos(casaDTO), HttpStatus.OK);
    }

}
