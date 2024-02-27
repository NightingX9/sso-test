package com.pcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.pcc.service.SsoService;
import com.pcc.model.Sso;
import com.pcc.request.InsertDataRequest;
import com.pcc.response.ApiResponse;
import com.pcc.response.ResponseData;

@RestController
public class SsoController {

    @Autowired
    private final SsoService ssoService;

    public SsoController(SsoService ssoService) {
        this.ssoService = ssoService;
    }

    @PostMapping(value = "/Insert")
    public ResponseEntity<ApiResponse> createEmployee(@RequestBody InsertDataRequest insertData) {
        ApiResponse response = new ApiResponse();
        ResponseData data = new ResponseData();
        System.out.println(insertData);
        try {
            Sso sso = ssoService.InsertData(insertData);
            data.setUserId(sso.getUserId());
            data.setTokenId(sso.getTokenId());
            response.setResponseCode(HttpStatus.OK.value());
            response.setResponseMessage("ทำรายการเรียบร้อย");
            response.setResponseData(data);
            return ResponseEntity.ok().body(response);
        } catch (Exception e) {
            response.setResponseCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
            response.setResponseMessage("ไม่สามารถบันทึกข้อมูลลงฐานข้อมูลได้");
            data.setUserId(insertData.getUserId());
            data.setTokenId(" ");
            response.setResponseData(data);
            return ResponseEntity.internalServerError().body(response);
        }
    }
}
