package com.birkil.hospitalmonitoring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class HastaNotFoundException extends RuntimeException{

    public HastaNotFoundException(String message) {
        super(message);
    }
}
