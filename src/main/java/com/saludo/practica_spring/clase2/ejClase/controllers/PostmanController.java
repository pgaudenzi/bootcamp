package com.saludo.practica_spring.clase2.ejClase.controllers;

import com.saludo.practica_spring.clase2.ejClase.dto.CasaDTO;
import com.saludo.practica_spring.clase2.ejClase.dto.SimpsonDTO;
import com.saludo.practica_spring.clase2.ejClase.services.PostmanService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/personajes")
public class PostmanController {

    @GetMapping("/{nombre}")
    public ResponseEntity obtenerInfo(@PathVariable String nombre) {
        return new ResponseEntity(PostmanService.buscarPersonaje(nombre), HttpStatus.OK);
    }

    @PostMapping("/Homero")
    public ResponseEntity enviarSimpson(@RequestBody SimpsonDTO personaje, @RequestHeader Map<String,String> header) {

        header.forEach((key, value) -> System.out.println(String.format("Parametros '%s' :  %s", key, value)));

        return new ResponseEntity(PostmanService.mapearSimpson(personaje), HttpStatus.OK);
    }

    @PostMapping("/Harry")
    public ResponseEntity enviarHarry(@RequestBody CasaDTO personaje) {
        return new ResponseEntity(PostmanService.mapearHarry(personaje), HttpStatus.OK);
    }

}
