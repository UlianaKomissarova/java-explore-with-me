package ru.practicum.comment.dto;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class NewCommentDto {
    @Length(min = 4, max = 1024)
    @NotBlank
    private String text;
}