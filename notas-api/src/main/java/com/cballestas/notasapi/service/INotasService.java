package com.cballestas.notasapi.service;


import com.cballestas.notasapi.dto.NotaDTO;

public interface INotasService {
    NotaDTO findByDni(String dni);
}
