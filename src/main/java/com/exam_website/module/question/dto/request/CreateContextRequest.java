package com.exam_website.module.question.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateContextRequest {
    @NotBlank(message = "Context type is required")
    private String type;

    @NotNull(message = "Content is required")
    private Map<String, Object> content;
}
