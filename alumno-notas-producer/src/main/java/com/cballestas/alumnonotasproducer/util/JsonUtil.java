package com.cballestas.alumnonotasproducer.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JsonUtil {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    private JsonUtil() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Método que realiza la conversion de objeto a JSON
     * @param data Objeto a convertir
     * @return Objeto convertido a Json
     */
    public static String objectToJson(Object data) {
        try {
            return MAPPER.writeValueAsString(data);
        } catch (Exception e) {
            log.error("Se presentó el siguiente error al convertir a JSON: [{}]", e.getMessage());
            throw new RuntimeException(e);
        }
    }

    /**
     * Método que realiza la conversion de objeto a JSON
     *
     * @param jsonData json
     * @param clazz tipo de objeto a retornar
     * @return Objeto serializado
     */
    public static <T> T jsonToObject(String jsonData, Class<T> clazz) {
        try {
            return MAPPER.readValue(jsonData, clazz);
        } catch (Exception e) {
            log.error("Se presentó el siguiente error al convertir a JSON: [{}]", e.getMessage());
            throw new RuntimeException(e);
        }
    }

}
