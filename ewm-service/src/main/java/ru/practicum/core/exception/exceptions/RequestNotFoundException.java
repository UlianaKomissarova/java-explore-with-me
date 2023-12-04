package ru.practicum.core.exception.exceptions;

public class RequestNotFoundException extends NotFoundException {
    public RequestNotFoundException(String message) {
        super(message);
    }
}