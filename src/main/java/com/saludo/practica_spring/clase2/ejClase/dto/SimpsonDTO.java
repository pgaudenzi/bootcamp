package com.saludo.practica_spring.clase2.ejClase.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class SimpsonDTO implements PersonajeDTO {

    private String nombre;
    private String apellido;
    private List<String> hijos;
    private Integer edad;
    private Boolean esposa;

}
