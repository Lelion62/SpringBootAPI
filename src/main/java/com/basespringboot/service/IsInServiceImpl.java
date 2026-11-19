package com.basespringboot.service;

import com.basespringboot.dto.IsInDto;
import com.basespringboot.entity.IsIn;
import com.basespringboot.repository.IsInRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor


public class IsInServiceImpl implements IsInService {
    private final IsInRepository isInRepository;

    @Override
    public IsIn save(IsInDto isInDto){
        IsIn isIn = new IsIn();
        isIn.setCarId(isInDto.getCarId());
        isIn.setFilmId(isInDto.getFilmId());
        return isInRepository.save(isIn);
    }
}
