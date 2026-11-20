package com.basespringboot.service;


import com.basespringboot.dto.FilmDto;
import com.basespringboot.entity.Film;
import com.basespringboot.repository.FilmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class FilmServiceImpl implements FilmService {

    private final FilmRepository filmRepository;

    @Override
    public Film save(FilmDto filmDto) {
        Film film = new Film();

        film.setName(filmDto.getName());
        film.setYear(filmDto.getYear());

        return filmRepository.save(film);
    }

    @Override
    public List<Film> findAll() {
        return filmRepository.findAll();
    }

    public Film findById(Long id) {
        return filmRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Car not found with id: " + id));
    }

    @Override
    public void deleteById(Long id) {
        filmRepository.deleteById(id);
    }


    @Override
    public void updateById(Long id, FilmDto filmDto) {
        Film film = this.findById(id);
        film.setName(filmDto.getName());
        film.setYear(filmDto.getYear());
        filmRepository.save(film);
    }
}
