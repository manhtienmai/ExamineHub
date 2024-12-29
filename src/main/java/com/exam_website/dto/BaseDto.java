package com.exam_website.dto;

import lombok.Data;
import org.mapstruct.MappingTarget;

import java.time.LocalDateTime;

@Data
@MappingTarget
public abstract class BaseDto {
    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
