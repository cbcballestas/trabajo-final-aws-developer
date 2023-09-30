package com.cballestas.alumnonotasconsumer.listeners;

import com.cballestas.alumnonotasconsumer.events.NotaEvent;
import com.cballestas.alumnonotasconsumer.model.Nota;
import com.cballestas.alumnonotasconsumer.repository.NotaRepository;
import com.cballestas.alumnonotasconsumer.util.JsonUtil;
import com.cballestas.alumnonotasconsumer.util.NotasUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class NotasEventListener {

    private final NotaRepository notaRepository;

    @KafkaListener(topics = "${consumer.kafka.topic}")
    public void handleNotasTopic(String message) {
        var notasEvent = JsonUtil.jsonToObject(message, NotaEvent.class);
        log.info("Mensaje obtenido: {}", notasEvent);

        //Agregar registro en base de datos, con el campo promedio
        var nota = Nota.builder()
                .DNI(notasEvent.getDNI())
                .nombres(notasEvent.getNombres())
                .notas(notasEvent.getNotas())
                .promedio(NotasUtil.obtenerPromedio(notasEvent.getNotas()))
                .build();

        Nota nuevaNota = this.notaRepository.save(nota);
        log.info("Nota Creada: {}", nuevaNota);
    }


}
