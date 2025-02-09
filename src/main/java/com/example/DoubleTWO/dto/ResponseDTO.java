package com.example.DoubleTWO.dto;

import com.example.DoubleTWO.entity.Question;

public record ResponseDTO (
        Long id,
        Question question,
        String response
) {

}
