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
    @Column(name = "car_id")
    private Integer carId;

    @Id
    @Column(name = "film_id")
    private Integer filmId;
}
