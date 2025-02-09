package com.example.DoubleTWO.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

//신원정보
@Getter
@NoArgsConstructor
@Entity
public class Identity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "identity")
    private List<Major> majors;

    @Builder
    public Identity(String name) {
        this.name = name;
    }
}
