package com.exam_website.module.question.dto.request;

import com.exam_website.DifficultyLevel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateQuestionRequest {
    @NotNull(message = "Question type ID is required")
    private Long typeId;

    @NotBlank(message = "Question text is required")
    private String text;

    private DifficultyLevel difficultyLevel;

    @NotEmpty(message = "Choices are required")
    @Size(min = 2, message = "At least 2 choices are required")
    private List<CreateChoiceRequest> choices;

    private CreateContextRequest context;
}