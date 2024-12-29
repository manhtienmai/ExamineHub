package com.exam_website.dto;

import com.exam_website.module.question.dto.response.QuestionResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExamResponse extends BaseDto {
    private String title;
    private String description;
    private Integer timeLimitMinutes;
    private Integer totalPoints;
    private List<QuestionResponse> questions;
}