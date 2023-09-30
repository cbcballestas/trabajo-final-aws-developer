package com.cballestas.notasapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotaDTO {
    private Long id;
    private String DNI;
    private String nombres;
    private List<Integer> notas;
    private double promedio;
}
