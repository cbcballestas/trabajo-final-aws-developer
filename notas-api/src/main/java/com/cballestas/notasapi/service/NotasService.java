package com.cballestas.notasapi.service;

import com.cballestas.notasapi.dto.NotaDTO;
import com.cballestas.notasapi.exception.ResourceNotFoundException;
import com.cballestas.notasapi.model.Nota;
import com.cballestas.notasapi.repository.NotaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class NotasService implements INotasService {

    private final NotaRepository notaRepository;

    @Override
    public NotaDTO findByDni(String dni) {

        var nota = this.notaRepository
                .findByDNI(dni)
                .orElseThrow(() -> new ResourceNotFoundException(String.format("Registro con DNI %s NO existe", dni)));

        return mapToDto(nota);
    }

    private NotaDTO mapToDto(Nota nota) {
        var notaDto = new NotaDTO();

        BeanUtils.copyProperties(nota, notaDto);

        return notaDto;
    }
}
