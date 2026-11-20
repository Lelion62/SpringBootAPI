package com.basespringboot.service;

import com.basespringboot.dto.FilmDto;
import com.basespringboot.entity.Film;

import java.util.List;

public interface FilmService {
    Film save(FilmDto film);
    List<Film> findAll();
    Film findById(Long id);
    void deleteById(Long id);
    void updateById(Long id, FilmDto film);
}
