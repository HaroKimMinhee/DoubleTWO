package com.example.DoubleTWO.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.DoubleTWO.entity.QuestionTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionTitleRepo extends JpaRepository<QuestionTitle, Long> {
    Page<QuestionTitle> findAll(Pageable pageable);
}
