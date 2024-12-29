package com.exam_website.dto;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateQuestionTypeRequest {
    @Size(max = 50, message = "Name must be less than 50 characters")
    private String name;

    private String description;
}