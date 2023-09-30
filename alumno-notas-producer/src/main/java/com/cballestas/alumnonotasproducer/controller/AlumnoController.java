package com.cballestas.alumnonotasproducer.controller;

import com.cballestas.alumnonotasproducer.dto.AlumnoDTO;
import com.cballestas.alumnonotasproducer.dto.ResponseDTO;
import com.cballestas.alumnonotasproducer.service.IAlumnosService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("alumno")
@RequiredArgsConstructor
public class AlumnoController {

    private final IAlumnosService alumnosService;

    /**
     * Método que recibe los datos del alumno
     * @param alumnoDTO datos a enviar
     * @return Mensaje de respuesta
     */
    @PostMapping
    public ResponseEntity<ResponseDTO> guardarNotas(@RequestBody @Valid AlumnoDTO alumnoDTO){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(alumnosService.enviarDatos(alumnoDTO));
    }
}
