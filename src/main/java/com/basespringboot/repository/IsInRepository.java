package com.basespringboot.repository;

import com.basespringboot.entity.IsIn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IsInRepository extends JpaRepository<IsIn, Long> {


}
