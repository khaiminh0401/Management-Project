package com.dkm.qlda.user;

import com.dkm.qlda.common.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandleException {
    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ResponseEntity<?> handleNotFoundException(NotFoundException ex) {
        return new ResponseEntity<>(
                ex.getResponse(),
                HttpStatus.OK);
    }
}
