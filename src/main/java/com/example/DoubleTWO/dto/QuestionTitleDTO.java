package com.example.DoubleTWO.dto;

import com.example.DoubleTWO.entity.Identity;
import com.example.DoubleTWO.entity.Question;
import com.example.DoubleTWO.entity.QuestionType;

import java.util.List;

public record QuestionTitleDTO (
        Long id,
        String title,
        QuestionType questionType,
        List<Question> questions,
        Identity identity
) {

}
