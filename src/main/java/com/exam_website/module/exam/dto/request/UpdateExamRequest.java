package com.exam_website.module.exam.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateExamRequest {
    private String title;
    private String description;
    private Integer timeLimitMinutes;
    private List<Long> questionIds;
}