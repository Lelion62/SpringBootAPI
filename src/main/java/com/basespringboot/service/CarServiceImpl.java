
package com.basespringboot.service;

import com.basespringboot.dto.CarDto;
import com.basespringboot.entity.Car;
import com.basespringboot.entity.Film;
import com.basespringboot.repository.CarRepository;
import com.basespringboot.repository.FilmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;
    private final FilmRepository filmRepository;

    @Override
    public Car save(CarDto carDto) {
        Car car = new Car();
        car.setBrand(carDto.getBrand());
        car.setModel(carDto.getModel());
        car.setColor(carDto.getColor());
        car.setDate(carDto.getDate());

        return carRepository.save(car);
    }

    @Override
    public List<Car> findAll() {
        return carRepository.findAllWithFilms();
    }

    @Override
    public Car findById(Long id) {
        return carRepository.findByIdWithFilms(id)
                .orElseThrow(() ->
                        new RuntimeException("Car not found with id: " + id));
    }

    @Override
    public void deleteById(Long id) {
        carRepository.deleteById(id);
    }

    @Override
    public void updateById(Long id, CarDto carDto) {
        Car car = findById(id);

        car.setBrand(carDto.getBrand());
        car.setModel(carDto.getModel());
        car.setColor(carDto.getColor());
        car.setDate(carDto.getDate());

        carRepository.save(car);
    }

    @Override
    public Car addFilm(Long carId, Long filmId) {
        Car car = findById(carId);

        Film film = filmRepository.findById(filmId)
                .orElseThrow(() ->
                        new RuntimeException("Film not found with id: " + filmId));

        if (car.getFilms() == null) {
            car.setFilms(new ArrayList<>());
        }

        if (!car.getFilms().contains(film)) {
            car.getFilms().add(film);
        }

        return carRepository.save(car);
    }

    @Override
    public Car removeFilm(Long carId, Long filmId) {
        Car car = findById(carId);

        Film film = filmRepository.findById(filmId)
                .orElseThrow(() ->
                        new RuntimeException("Film not found with id: " + filmId));

        car.getFilms().remove(film);

        return carRepository.save(car);
    }
}
