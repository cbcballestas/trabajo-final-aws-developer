package com.cballestas.alumnonotasproducer.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlumnoDTO implements Serializable {
    @NotEmpty(message = "Debe ingresar un dni")
    @NotNull(message = "Debe ingresar un dni")
    private String DNI;

    @NotEmpty(message = "Debe ingresar un nombre")
    @NotNull(message = "Debe ingresar un nombre")
    private String nombres;

    @NotEmpty(message = "Las notas son requeridas")
    private List<Integer> notas;
}
