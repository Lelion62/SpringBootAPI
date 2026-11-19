package com.basespringboot;

import com.basespringboot.entity.Car;
import com.basespringboot.entity.Film;
import com.basespringboot.entity.IsIn;
import com.basespringboot.repository.CarRepository;
import com.basespringboot.repository.FilmRepository;
import com.basespringboot.repository.IsInRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BaseSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(
                BaseSpringBootApplication.class, args
        );
    }

    @Bean
    CommandLineRunner init(FilmRepository filmRepository, CarRepository carRepository, IsInRepository isInRepository) {
        return args -> {

            if (filmRepository.count() == 0) {

                Film film = new Film();
                film.setName("Retour vers le futur");
                film.setYear(1985);

                filmRepository.save(film);
            }

            if (carRepository.count() == 0) {

                Car car = new Car();
                car.setBrand("Dolorean");
                car.setModel("DMC-12");
                car.setColor("Grise");
                car.setDate(1981);

                carRepository.save(car);
            }

            if (isInRepository.count() == 0) {

                IsIn isIn = new IsIn();
                isIn.setCar_id(1);
                isIn.setFilm_id(1);

                isInRepository.save(isIn);
            }
        };
    }
}