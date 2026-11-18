package com.basespringboot.service;

import com.basespringboot.dto.FilmDto;
import com.basespringboot.entity.Film;

public interface FilmService {
    Film save(FilmDto film);
}
