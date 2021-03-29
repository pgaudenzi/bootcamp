package com.saludo.practica_spring.clase2.obtener_diploma.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DiplomaDto {

    private AlumnoDto alumno;
    private float promedio;
    private String mensaje;

}
