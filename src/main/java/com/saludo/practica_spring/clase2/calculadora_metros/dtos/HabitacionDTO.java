package com.saludo.practica_spring.clase2.calculadora_metros.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HabitacionDTO {

    private String nombre;
    private float ancho;
    private float largo;

}
