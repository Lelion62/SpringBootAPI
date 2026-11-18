package com.basespringboot.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IsInDto {

    @NotBlank
    private Integer carId;
    private Integer filmId;
}
