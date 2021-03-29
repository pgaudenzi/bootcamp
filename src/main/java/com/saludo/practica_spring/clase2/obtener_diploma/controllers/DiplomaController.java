package com.saludo.practica_spring.clase2.obtener_diploma.controllers;

import com.saludo.practica_spring.clase2.obtener_diploma.dtos.AlumnoDto;
import com.saludo.practica_spring.clase2.obtener_diploma.services.DiplomaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/obtener")
public class DiplomaController {

    @PostMapping("/diploma")
    public ResponseEntity obtenerDiploma(@RequestBody AlumnoDto alumno) {
        return new ResponseEntity(DiplomaService.generarDiploma(alumno), HttpStatus.OK);
    }

}
