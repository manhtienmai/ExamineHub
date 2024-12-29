package com.exam_website.module.exam.repository;

import org.hibernate.Internal;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {
    @Query("SELECT e FROM Exam e LEFT JOIN FETCH e.questions WHERE e.id = :id")
    Optional<Exam> findByIdWithQuestions(@Param("id") Long id);

    Page<Exam> findAll(Specification<Exam> spec, Pageable pageable);
}
