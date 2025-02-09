package com.example.DoubleTWO.dto;

import com.example.DoubleTWO.entity.Identity;

public record MajorDTO (
        Long id,
        String name,
        Identity identity
) {

}
