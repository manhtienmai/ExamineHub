package com.exam_website.module.question.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QuestionSearchRequest {
    private String type;
    private String difficultyLevel;
    private String textContains;

    @Builder.Default
    private String sortBy = "id";

    @Builder.Default
    private String sortDirection = "ASC";

    @Builder.Default
    private Integer page = 0;

    @Builder.Default
    private Integer size = 10;
}
