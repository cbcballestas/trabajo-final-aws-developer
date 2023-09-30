package com.cballestas.alumnonotasconsumer.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotaEvent {
    private String DNI;
    private String nombres;
    private List<Integer> notas;
}
