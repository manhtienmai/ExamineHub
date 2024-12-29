package com.exam_website.module.question.service.impl;

import com.sat.sat_exam_website.QuestionRepository;
import com.exam_website.common.entity.ResourceNotFoundException;
import com.exam_website.module.question.dto.request.CreateQuestionRequest;
import com.exam_website.module.question.dto.response.QuestionResponse;
import com.exam_website.module.question.entity.Question;
import com.exam_website.module.question.entity.QuestionType;
import com.exam_website.module.question.mapper.QuestionMapper;
import com.exam_website.module.question.service.QuestionService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class QuestionServiceImpl implements QuestionService {
    private final QuestionRepository questionRepository;
    private final QuestionMapper questionMapper;
    private QuestionTypeRepository questionTypeRepository;

    @Override
    public QuestionResponse create(CreateQuestionRequest request) {
        QuestionType type = questionTypeRepository.findById(request.getTypeId())
                .orElseThrow(() -> new ResourceNotFoundException("Question type not found"));

        Question question = questionMapper.toEntity(request);
        question.setType(type);

        Question savedQuestion = questionRepository.save(question);
        return questionMapper.toResponse(savedQuestion);
    }
}

