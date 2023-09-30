package com.cballestas.alumnonotasproducer.service;

import com.cballestas.alumnonotasproducer.dto.AlumnoDTO;
import com.cballestas.alumnonotasproducer.dto.ResponseDTO;

public interface IAlumnosService {
    ResponseDTO enviarDatos(AlumnoDTO alumnoDTO);
}
