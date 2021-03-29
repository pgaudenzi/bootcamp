package com.saludo.practica_spring.clase2.calculadora_metros.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CasaDTO {

    private String nombre;
    private String direccion;
    private List<HabitacionDTO> habitaciones;

}
