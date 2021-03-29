package com.saludo.practica_spring.clase2.calculadora_metros.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalculoDto {

    private Float metrosTotales;
    private Float valor;
    private HabitacionDTO habitacionMasGrande;
    private Map<HabitacionDTO,Float> metrosPorHabitacion;
}
