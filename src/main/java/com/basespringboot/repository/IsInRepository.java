package com.basespringboot.repository;

import com.basespringboot.entity.IsIn;
import com.basespringboot.entity.IsInId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IsInRepository extends JpaRepository<IsIn, IsInId> {
    List<IsIn> findAllByCarId(Integer carId);

    List<IsIn> findAllByFilmId(Integer filmId);
}
