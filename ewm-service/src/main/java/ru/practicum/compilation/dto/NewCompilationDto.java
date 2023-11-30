package ru.practicum.compilation.dto;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NewCompilationDto {
    @NotNull
    @NotBlank
    @Length(max = 50)
    private String title;
    private Boolean pinned;
    private List<Long> events;
}