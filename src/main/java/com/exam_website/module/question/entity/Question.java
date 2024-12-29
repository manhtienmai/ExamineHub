package com.exam_website.module.question.entity;

import com.exam_website.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "questions")
@Getter
@Setter
public class Question extends BaseEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id")
    private QuestionType questionType;

    @Column(nullable = false)
    private String text;

    @Column(name = "difficulty_level")
    private String difficultyLevel;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Choice> choices = new ArrayList<>();

    @OneToOne(mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true)
    private Context context;
}
