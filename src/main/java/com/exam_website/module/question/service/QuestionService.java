package com.exam_website.module.question.service;

import com.exam_website.module.question.dto.request.CreateQuestionRequest;
import com.exam_website.module.question.dto.response.QuestionResponse;

import java.util.List;

public interface QuestionService {
    QuestionResponse create(CreateQuestionRequest request);
    QuestionResponse getById(Long id);
    void delete(Long id);
    List<QuestionResponse> getByIds(List<Long> ids);
//    PageResponse<QuestionResponse> search(QuestionSearchRequest request);
}
