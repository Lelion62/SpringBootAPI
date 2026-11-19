package com.basespringboot.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IsInDto {

    @NotNull
    private Integer carId;

    @NotNull
    private Integer filmId;
}
