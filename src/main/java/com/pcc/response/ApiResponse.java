package com.pcc.response;

import lombok.Data;

@Data
public class ApiResponse {

    private String responseMessage;
    private ResponseData responseData;
}
