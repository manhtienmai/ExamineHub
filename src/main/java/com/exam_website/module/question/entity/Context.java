package com.exam_website.module.question.entity;

import com.exam_website.common.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Map;

@Entity
@Table(name = "contexts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Context extends BaseEntity {

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "question_id")
    private Question question;

    @Column(name = "context_type")
    private String type;

    @Type(JsonType.class)
    @Column(columnDefinition = "jsonb")
    private Map<String, Object> content;
}
