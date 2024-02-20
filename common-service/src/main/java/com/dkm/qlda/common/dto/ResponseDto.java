package com.dkm.qlda.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class ResponseDto {
    private Object data;
    private String msg;
    private boolean success;
}
