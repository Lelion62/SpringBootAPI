
package com.basespringboot;

import com.basespringboot.entity.Car;
import com.basespringboot.entity.Film;
import com.basespringboot.repository.CarRepository;
import com.basespringboot.repository.FilmRepository;
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
    CommandLineRunner init(
            FilmRepository filmRepository,
            CarRepository carRepository
    ) {
        return args -> {

            Film film;

            if (filmRepository.count() == 0) {
                film = new Film();
                film.setName("Retour vers le futur");
                film.setYear(1985);

                film = filmRepository.save(film);
            } else {
                film = filmRepository.findAll().getFirst();
            }

            Car car;

            if (carRepository.count() == 0) {
                car = new Car();
                car.setBrand("DeLorean");
                car.setModel("DMC-12");
                car.setColor("Grise");
                car.setDate(1981);

                car = carRepository.save(car);
            } else {
                car = carRepository.findAll().getFirst();
            }

            // Création de la relation ManyToMany
            if (!car.getFilms().contains(film)) {
                car.getFilms().add(film);
                carRepository.save(car);
            }
        };
    }
}
