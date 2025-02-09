package com.example.DoubleTWO.repo;

import com.example.DoubleTWO.entity.Question;
import com.example.DoubleTWO.entity.QuestionTitle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepo extends JpaRepository<Question, Long> {
    List<Question> findByQuestionTitle(QuestionTitle questionTitle);
}
