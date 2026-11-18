package com.basespringboot.service;

import com.basespringboot.dto.IsInDto;
import com.basespringboot.entity.IsIn;

public interface IsInService {
    IsIn save(IsInDto isIn);
}
