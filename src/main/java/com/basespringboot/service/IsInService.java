package com.basespringboot.service;

import com.basespringboot.dto.IsInDto;
import com.basespringboot.entity.IsIn;

import java.util.List;

public interface IsInService {
    IsIn save(IsInDto isIn);
    List<IsIn> findAll();
    List<IsIn> findByCarId(Integer carId);
    List<IsIn> findByFilmId(Integer filmId);
}
