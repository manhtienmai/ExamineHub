package com.exam_website.module.exam.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExamSearchRequest {
    private String titleContains;
    private Integer minTimeLimit;
    private Integer maxTimeLimit;

    @Builder.Default
    private String sortBy = "id";

    @Builder.Default
    private String sortDirection = "ASC";

    @Builder.Default
    private Integer page = 0;

    @Builder.Default
    private Integer size = 10;
}
