package com.basespringboot.controller;

import com.basespringboot.dto.IsInDto;
import com.basespringboot.entity.IsIn;
import com.basespringboot.service.IsInService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping( "/isins")
@RestController
@RequiredArgsConstructor

public class IsInController {

    private final IsInService isInService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public IsIn save(@Valid @RequestBody IsInDto isIn){
        return isInService.save(isIn);
    }

    @GetMapping
    public List<IsIn> findAll() {
        return isInService.findAll();
    }

    @GetMapping("/car/{carId}")
    public List<IsIn> findByCarId(@PathVariable Integer carId) {
        return isInService.findByCarId(carId);
    }

    @GetMapping("/film/{filmId}")
    public List<IsIn> findByFilmId(@PathVariable Integer filmId) {
        return isInService.findByFilmId(filmId);
    }
}
