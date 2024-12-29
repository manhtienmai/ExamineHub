package com.exam_website.module.exam.mapper;

import com.exam_website.module.exam.dto.request.CreateExamRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ExamMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    Exam toEntity(CreateExamRequest request);

    ExamResponse toResponse(Exam exam);

    void updateEntityFromDto(UpdateExamRequest request, @MappingTarget Exam exam);
}
