package com.cballestas.notasapi.controller;

import com.cballestas.notasapi.dto.NotaDTO;
import com.cballestas.notasapi.service.INotasService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("alumno")
@RequiredArgsConstructor
public class NotaController {
    private final INotasService notasService;

    @GetMapping("/{dni}")
    public ResponseEntity<NotaDTO> findByDni(@PathVariable String dni) {
        return ResponseEntity.ok(
                notasService.findByDni(dni)
        );
    }
}
