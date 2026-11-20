package com.basespringboot.dto;

public record LoginRequest(
        String username,
        String password
) {}