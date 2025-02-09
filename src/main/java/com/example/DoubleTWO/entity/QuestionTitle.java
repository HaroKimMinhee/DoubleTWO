package com.example.DoubleTWO.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.aspectj.weaver.patterns.TypePatternQuestions;

import java.util.List;


@Getter
@NoArgsConstructor
@Entity
public class QuestionTitle {
    // 질문
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @OneToMany(mappedBy = "questionTitle")
    private List<Question> questions;

    @Builder
    public QuestionTitle(String title) {
        this.title = title;
    }


}
