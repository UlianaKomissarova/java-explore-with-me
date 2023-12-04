package ru.practicum.core.exception.exceptions;

import ru.practicum.core.exception.exceptions.BadRequestException;

public class ViewStatsBadRequestException extends BadRequestException {
    public ViewStatsBadRequestException(String message) {
        super(message);
    }
}