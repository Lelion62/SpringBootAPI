package com.basespringboot.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FilmDto {

    @NotBlank
    private String name;

    private int year;

    private List<Long> carIds;
}
