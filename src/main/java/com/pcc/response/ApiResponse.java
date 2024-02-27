package com.pcc.response;

import lombok.Data;

@Data
public class ApiResponse {

    private int responseCode;
    private String responseMessage;
    private ResponseData responseData;

}
