package com.exam_website.module.question.entity;

import com.exam_website.common.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "question_types")
@Getter
@Setter
public class QuestionType extends BaseEntity {
    @Column(nullable = false, length = 50)
    private String name;

    private String description;

    @OneToMany(mappedBy = "type")
    private List<Question> questions = new ArrayList<>();
}
