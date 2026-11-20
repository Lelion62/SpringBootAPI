package com.basespringboot.service;

import com.basespringboot.dto.CarDto;
import com.basespringboot.entity.Car;

import java.util.List;

public interface CarService {
    Car save(CarDto car);
    List<Car> findAll();
    Car findById(Long id);
    void deleteById(Long id);
    void updateById(Long id, CarDto car);

    Car addFilm(Long carId, Long filmId);
    Car removeFilm(Long carId, Long filmId);
}
