package com.basespringboot.service;

import com.basespringboot.dto.FilmDto;
import com.basespringboot.entity.Car;
import com.basespringboot.entity.Film;

import java.util.List;

public interface FilmService {
    Film save(FilmDto film);
    List<Film> findAll();
}
