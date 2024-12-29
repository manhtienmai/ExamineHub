package com.exam_website.module.question.controller;

import com.exam_website.common.entity.ApiResponse;
import com.exam_website.module.question.dto.request.CreateQuestionRequest;
import com.exam_website.module.question.dto.response.QuestionResponse;
import com.exam_website.module.question.service.QuestionService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/questions")
@Validated
@RequiredArgsConstructor
@Tag(name = "Question Management")
public class QuestionController {
    private final QuestionService questionService;

    @PostMapping
    public ResponseEntity<ApiResponse<QuestionResponse>> create(
            @Valid @RequestBody CreateQuestionRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(ApiResponse.success(questionService.create(request)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<QuestionResponse>> getById(@PathVariable Long id) {
        return ResponseEntity.ok(ApiResponse.success(questionService.getById(id)));
    }
}
