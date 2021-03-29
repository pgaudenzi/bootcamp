package com.saludo.practica_spring.clase2.ejClase.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CasaDTO implements PersonajeDTO {

    private String nombre;
    private List<String> colores;
    private List<EstudianteDTO> estudianteDTOS;

}
