package com.basespringboot.controller;

import com.basespringboot.dto.FilmDto;
import com.basespringboot.entity.Film;
import com.basespringboot.service.FilmService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController( "/films")
@RequestMapping()
@RequiredArgsConstructor

public class FilmController {

    private final FilmService filmService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Film save(@Valid @RequestBody FilmDto film){
        return filmService.save(film);
    }

}
