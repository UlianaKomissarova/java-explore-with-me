package ru.practicum.core.exception.exceptions;

public class RequestConflictException extends ConflictException {
    public RequestConflictException(String message) {
        super(message);
    }
}