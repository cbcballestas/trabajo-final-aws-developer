package com.cballestas.alumnonotasproducer.exception;

import lombok.Builder;

import java.util.List;

@Builder
public record ErrorsResponse(List<String> errores) {
}
