package com.exam_website.module.question.repository;

import com.exam_website.module.question.entity.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    @Query("SELECT q  FROM Question q LEFT JOIN FETCH q.choices where q.id = :id")
    Optional<Question> findByIdWithChoices(@Param("id") Long id);

    @Query("SELECT q FROM Question q LEFT JOIN FETCH q.choices WHERE q.id IN :ids")
    Optional<List<Question>> findAllByIdWithChoices(@Param("ids") List<Long> ids);

    Page<Question> findAll(Specification<Question> spec, Pageable pageable);
}
