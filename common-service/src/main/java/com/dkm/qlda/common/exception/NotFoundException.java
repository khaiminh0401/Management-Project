package com.dkm.qlda.common.exception;

import com.dkm.qlda.common.dto.ResponseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

public class NotFoundException extends BaseException{
    public NotFoundException(String message) {
        super(message);
    }
}
