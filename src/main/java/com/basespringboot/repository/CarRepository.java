
package com.basespringboot.repository;

import com.basespringboot.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    @Query("SELECT DISTINCT c FROM Car c LEFT JOIN FETCH c.films")
    List<Car> findAllWithFilms();

    @Query("SELECT c FROM Car c LEFT JOIN FETCH c.films WHERE c.id = :id")
    Optional<Car> findByIdWithFilms(Long id);
}
