package com.example.DoubleTWO.dto;

import com.example.DoubleTWO.entity.Question;
import com.example.DoubleTWO.entity.QuestionTitle;

public record QuestionDTO (
    Long id,
    String item,
    QuestionTitle questionTitle
) {

}
