package com.cballestas.notasapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "alumno_notas")
@Builder
public class Nota {

    @Id
    @SequenceGenerator(name = "notas_seq",initialValue = 1,sequenceName = "notas_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "notas_seq")
    private Long id;

    private String DNI;
    private String nombres;

    @ElementCollection
    private List<Integer> notas;
    private double promedio;
}
