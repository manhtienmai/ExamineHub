package com.exam_website.module.question.dto.response;

import com.exam_website.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContextResponse extends BaseDto {
    private Long id;
    private String type;
    private Map<String, Object> content;
}
