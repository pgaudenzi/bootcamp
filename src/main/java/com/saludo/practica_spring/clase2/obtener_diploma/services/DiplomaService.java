package com.saludo.practica_spring.clase2.obtener_diploma.services;

import com.saludo.practica_spring.clase2.obtener_diploma.dtos.AlumnoDto;
import com.saludo.practica_spring.clase2.obtener_diploma.dtos.AsignaturaDto;
import com.saludo.practica_spring.clase2.obtener_diploma.dtos.DiplomaDto;

import java.util.List;

public class DiplomaService {

    public static DiplomaDto generarDiploma(AlumnoDto almuno) {
        final Float promedio = calcularPromedio(almuno.getAsignaturas());
        final String mensaje = felicitar(promedio);

        return new DiplomaDto(almuno, promedio, mensaje);
    }

    private static Float calcularPromedio(List<AsignaturaDto> asignaturas) {
        int total = 0;
        for (AsignaturaDto asignatura : asignaturas) {
            total += asignatura.getNota();
        }
        return (float) total / asignaturas.size();
    }

    private static String felicitar(Float promedio){
        if (promedio > 9) return "Felicitaciones!!";
        return "";
    }

}
