package com.basespringboot.entity;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class IsInId implements Serializable {
    private Integer car_id;
    private Integer film_id;
}
