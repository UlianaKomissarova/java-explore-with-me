package ru.practicum.core.exception.exceptions;

public class UserNotFoundException extends NotFoundException {
    public UserNotFoundException(String message) {
        super(message);
    }
}