package com.saludo.practica_spring.clase2.obtener_diploma.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AsignaturaDto {

    private String nombre;
    private int nota;

}
