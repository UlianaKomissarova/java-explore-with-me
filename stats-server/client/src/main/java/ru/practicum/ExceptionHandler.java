package ru.practicum;

import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.*;

import java.util.Map;

@RestControllerAdvice
@RequiredArgsConstructor
public class ExceptionHandler {
    private final RestTemplate rest;

    @org.springframework.web.bind.annotation.ExceptionHandler(HttpStatusCodeException.class)
    public ResponseEntity<Object> handleHttpClientErrorException(HttpStatusCodeException e) {
        return ResponseEntity.status(e.getStatusCode()).body(e.getResponseBodyAsByteArray());
    }

    public ResponseEntity<Object> handleStatsServiceException(HttpEntity<?> requestEntity, HttpMethod method,
        String path, Map<String, Object> parameters) {
        ResponseEntity<Object> statsServiceResponse;

        try {
            if (parameters != null) {
                statsServiceResponse = rest.exchange(path, method, requestEntity, Object.class, parameters);
            } else {
                statsServiceResponse = rest.exchange(path, method, requestEntity, Object.class);
            }
        } catch (HttpStatusCodeException e) {
            return handleHttpClientErrorException(e);
        }

        return statsServiceResponse;
    }
}