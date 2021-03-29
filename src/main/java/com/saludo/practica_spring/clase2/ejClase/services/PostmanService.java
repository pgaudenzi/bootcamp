package com.saludo.practica_spring.clase2.ejClase.services;

import com.saludo.practica_spring.clase2.ejClase.dto.EstudianteDTO;
import com.saludo.practica_spring.clase2.ejClase.dto.CasaDTO;
import com.saludo.practica_spring.clase2.ejClase.dto.PersonajeDTO;
import com.saludo.practica_spring.clase2.ejClase.dto.SimpsonDTO;

import java.util.ArrayList;
import java.util.List;

public class PostmanService {

    public static PersonajeDTO buscarPersonaje(String nombre) {
        if (nombre.equals("Harry")) {
            List<String> colores = new ArrayList<>();
            colores.add("Amarillo");
            colores.add("Bordo");

            List<EstudianteDTO> estudianteDTOS = new ArrayList<>();
            estudianteDTOS.add(new EstudianteDTO("Harry", "Potter"));
            estudianteDTOS.add(new EstudianteDTO("Hermione", "Granger"));
            estudianteDTOS.add(new EstudianteDTO("Ron", "Weasley"));

            return new CasaDTO("Gryffindor", colores, estudianteDTOS);

        } else {
            List<String> hijos = new ArrayList<>();
            hijos.add("Bart");
            hijos.add("Lisa");
            hijos.add("Maggie");

            return new SimpsonDTO("Homero", "Simpson", hijos, 45, true);

        }
    }

    public static SimpsonDTO mapearSimpson(SimpsonDTO personaje) {
        return personaje;
    }

    public static CasaDTO mapearHarry(CasaDTO personaje) {
        return personaje;
    }
}
