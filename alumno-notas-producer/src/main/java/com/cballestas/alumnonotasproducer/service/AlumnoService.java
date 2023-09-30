package com.cballestas.alumnonotasproducer.service;

import com.cballestas.alumnonotasproducer.dto.AlumnoDTO;
import com.cballestas.alumnonotasproducer.dto.ResponseDTO;
import com.cballestas.alumnonotasproducer.util.JsonUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class AlumnoService implements IAlumnosService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Value("${kafka.topic}")
    private String topic;

    /**
     * Método que se encarga de enviar los datos al tópico alumno_notas
     * @param alumnoDTO datos a enviar
     * @return Mensaje de respuesta
     */
    @Override
    public ResponseDTO enviarDatos(AlumnoDTO alumnoDTO) {
        String message = JsonUtil.objectToJson(alumnoDTO);
        log.info("Datos a enviar: {}", message);

        // Se envía mensaje a alumno_notas topic
        this.kafkaTemplate.send(topic, message);

        return ResponseDTO.builder()
                .message("Datos enviados con éxito")
                .build();
    }
}
