package com.basespringboot.service;

import com.basespringboot.dto.CarDto;
import com.basespringboot.entity.Car;

public interface CarService {
    Car save(CarDto car);
}
