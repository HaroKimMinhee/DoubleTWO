package com.example.DoubleTWO.dto;

import com.example.DoubleTWO.entity.Major;

import java.util.List;

public record IdentityDTO (
        Long id,
        String name,
        List<Major> major
) {

}
