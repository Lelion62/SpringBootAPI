package com.basespringboot.controller;
import com.basespringboot.dto.CarDto;
import com.basespringboot.entity.Car;
import com.basespringboot.service.CarService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/cars")
@RestController
@RequiredArgsConstructor

public class CarController {

    private final CarService carService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Car save(@Valid @RequestBody CarDto car){
        return carService.save(car);
    }

}
