package com.saludo.practica_spring.clase2.obtener_diploma.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class AlumnoDto {

    private String nombre;
    private List<AsignaturaDto> asignaturas;

}
