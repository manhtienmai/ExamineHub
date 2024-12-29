package com.exam_website.module.question.dto.request;

import com.exam_website.DifficultyLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateQuestionRequest {
    private String text;
    private Integer points;
    private DifficultyLevel difficultyLevel;
    private List<UpdateChoiceRequest> choices;
    private UpdateContextRequest context;
}
