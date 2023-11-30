package ru.practicum.request.dto;

import org.springframework.stereotype.Component;
import ru.practicum.request.model.ParticipationRequest;

@Component
public class RequestMapper {
    public static ParticipationRequestDto toRequestDto(ParticipationRequest request) {
        return ParticipationRequestDto.builder()
            .id(request.getId())
            .event(request.getEvent().getId())
            .requester(request.getRequester().getId())
            .created(request.getCreated())
            .status(request.getStatus())
            .build();
    }
}