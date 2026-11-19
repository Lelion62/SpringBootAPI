package com.basespringboot.entity;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class IsInId implements Serializable {
    private Integer carId;
    private Integer filmId;
}
