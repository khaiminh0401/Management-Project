package com.dkm.qlda.common.exception;

import com.dkm.qlda.common.dto.ResponseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;

@Data
@AllArgsConstructor
public class BaseException extends RuntimeException{
    public BaseException(String message){
        super(message);
    }
    public ResponseDto getResponse(){
        return ResponseDto.builder()
                .data(null)
                .success(false)
                .msg(this.getMessage())
                .build();
    }
}
