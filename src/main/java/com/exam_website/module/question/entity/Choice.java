package com.exam_website.module.question.entity;

import com.exam_website.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "choices")
@Getter
@Setter
public class Choice extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private Question question;

    @Column(name = "choice_id", length = 2)
    private String choiceId;

    @Column(name = "choice_text")
    private String text;

    @Column(name = "is_correct")
    private boolean correct;
}
