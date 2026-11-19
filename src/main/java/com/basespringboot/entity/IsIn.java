package com.basespringboot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@IdClass(IsInId.class)
public class IsIn {
    @Id
    private Integer car_id;

    @Id
    private Integer film_id;
}
