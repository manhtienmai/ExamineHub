package com.exam_website.module.question.dto.response;

import com.exam_website.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChoiceResponse extends BaseDto {
    private Long id;
    private String choiceId;
    private String text;
    private boolean isCorrect;
}
