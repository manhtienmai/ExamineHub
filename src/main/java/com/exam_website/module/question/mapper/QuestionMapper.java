package com.exam_website.module.question.mapper;

import com.exam_website.module.question.dto.request.CreateQuestionRequest;
import com.exam_website.module.question.dto.request.UpdateQuestionRequest;
import com.exam_website.module.question.dto.response.QuestionResponse;
import com.exam_website.module.question.entity.Question;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface QuestionMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    Question toEntity(CreateQuestionRequest request);

    QuestionResponse toResponse(Question question);

    void updateEntityFromDto(UpdateQuestionRequest request, @MappingTarget Question question);
}
