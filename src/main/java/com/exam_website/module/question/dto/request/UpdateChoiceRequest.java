package com.exam_website.module.question.dto.request;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateChoiceRequest {
    @Size(max = 2, message = "Choice ID must be less than 2 characters")
    private String choiceId;
    private String text;
    private Boolean isCorrect;
}
