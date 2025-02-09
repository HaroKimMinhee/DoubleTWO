package com.example.DoubleTWO.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Question {
    // 질문 항문
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( nullable = false)
    private String item;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private QuestionType questionType;

    @ManyToOne
    @JoinColumn(name="question_title_id", nullable = false)
    private QuestionTitle questionTitle;

    @Builder
    public Question(String item,QuestionType questionType) {
        this.item = item;
        this.questionType = questionType;
    }
}
