package com.exam_website.module.question.dto.response;

import com.exam_website.DifficultyLevel;
import com.exam_website.dto.BaseDto;
import com.exam_website.dto.QuestionTypeResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QuestionResponse extends BaseDto {
    private Long id;
    private QuestionTypeResponse type;
    private String text;
    private Integer points;
    private DifficultyLevel difficultyLevel;
    private List<ChoiceResponse> choices;
    private ContextResponse context;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}