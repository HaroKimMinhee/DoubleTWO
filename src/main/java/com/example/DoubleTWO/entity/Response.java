package com.example.DoubleTWO.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Response {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="question_id", nullable = false)
    private Question question;

    @ManyToOne
    @JoinColumn(name="identity_id", nullable = false)
    private Identity identity;

    @Column(nullable = false)
    private String response;

    @Builder
    public Response(Question question, Identity identity, String response) {
        this.question = question;
        this.identity = identity;
        this.response = response;
    }
}
