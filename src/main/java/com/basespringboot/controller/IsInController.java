package com.basespringboot.controller;

import com.basespringboot.dto.IsInDto;
import com.basespringboot.entity.IsIn;
import com.basespringboot.service.IsInService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;



@RequestMapping( "/isins")
@RestController
@RequiredArgsConstructor

public class IsInController {

    private final IsInService isInService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public IsIn save(@Valid @RequestBody IsInDto isIn){
        return isInService.save(isIn);
    }

}
