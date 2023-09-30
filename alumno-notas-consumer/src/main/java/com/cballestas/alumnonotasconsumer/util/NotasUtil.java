package com.cballestas.alumnonotasconsumer.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NotasUtil {
    private NotasUtil() {
        throw new IllegalStateException("Utility class");
    }

    public static List<Integer> obtenerListaNotasPorNumero(String notas) {
        return Arrays.stream(notas.split(","))
                .map(Integer::parseInt)
                .toList();
    }

    public static String convertirListaNumerosATexto(List<Integer> notas) {
        return notas.stream().map(String::valueOf)
                .collect(Collectors.joining(","));
    }

    public static double obtenerPromedio(List<Integer> notas) {
        return notas.stream()
                .mapToInt(value -> value)
                .average()
                .orElse(0);
    }

}
