package com.saludo.practica_spring.clase2.calculadora_metros.services;

import com.saludo.practica_spring.clase2.calculadora_metros.dtos.CasaDTO;
import com.saludo.practica_spring.clase2.calculadora_metros.dtos.CalculoDto;
import com.saludo.practica_spring.clase2.calculadora_metros.dtos.HabitacionDTO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculoService {

    private static final int PRECIO = 500;

    public static CalculoDto calcularDatos(CasaDTO casa) {

        final Float metrosTotales = calcularMetrosTotales(casa.getHabitaciones());
        final Float valor = calcularValor(metrosTotales);
        final HabitacionDTO habitacionMasGrande = calcularHabitacionMasGrande(casa.getHabitaciones());
        final Map<HabitacionDTO,Float> metrosPorHabitacion = calcularMetrosPorHabitacion(casa.getHabitaciones());

        return new CalculoDto(metrosTotales, valor, habitacionMasGrande, metrosPorHabitacion);
    }

    private static Float calcularMetrosCuadrados(HabitacionDTO habitacion) {
        return habitacion.getAncho() * habitacion.getLargo();
    }

    private static Float calcularMetrosTotales(List<HabitacionDTO> habitaciones) {

        Float metrosTotales = 0.0f;

        for (HabitacionDTO habitacion : habitaciones) {
            metrosTotales += calcularMetrosCuadrados(habitacion);
        }

        return metrosTotales;
    }

    private static Float calcularValor(float metrosTotales) {
        return metrosTotales * PRECIO;
    }

    private static HabitacionDTO calcularHabitacionMasGrande(List<HabitacionDTO> habitaciones) {
        HabitacionDTO habitacionMasGrande = null;
        for (HabitacionDTO habitacion : habitaciones) {
            if (habitacionMasGrande == null) {
                habitacionMasGrande = habitacion;
            } else {
                if (calcularMetrosCuadrados(habitacion) > calcularMetrosCuadrados(habitacionMasGrande)) {
                    habitacionMasGrande = habitacion;
                }
            }
        }
        return habitacionMasGrande;
    }

    private static Map<HabitacionDTO,Float> calcularMetrosPorHabitacion(List<HabitacionDTO> habitaciones) {
        final Map<HabitacionDTO, Float> metrosPorHabitacion = new HashMap<>();
        for (HabitacionDTO habitacion : habitaciones) {
            metrosPorHabitacion.put(habitacion, calcularMetrosCuadrados(habitacion));
        }
        return metrosPorHabitacion;
    }

}
