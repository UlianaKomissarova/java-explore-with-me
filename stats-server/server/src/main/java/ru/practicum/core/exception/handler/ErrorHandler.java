package ru.practicum.core.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.*;
import ru.practicum.core.exception.exceptions.BadRequestException;

import java.time.LocalDateTime;
import java.util.*;

@RestControllerAdvice
public class ErrorHandler {
    @ExceptionHandler({BadRequestException.class, MissingServletRequestParameterException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiError handleBadRequestException(final BadRequestException exception) {
        return new ApiError(
            List.of(Arrays.toString(exception.getStackTrace())),
            exception.getMessage(),
            exception.getLocalizedMessage(),
            HttpStatus.BAD_REQUEST.toString(),
            LocalDateTime.now()
        );
    }

    @ExceptionHandler
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ApiError handleStatusException(final Exception exception) {
        return new ApiError(
            List.of(Arrays.toString(exception.getStackTrace())),
            exception.getMessage(),
            exception.getLocalizedMessage(),
            HttpStatus.CONFLICT.toString(),
            LocalDateTime.now()
        );
    }
}