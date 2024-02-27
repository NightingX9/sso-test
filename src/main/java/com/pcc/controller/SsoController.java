package com.pcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.pcc.service.SsoService;
import com.pcc.model.Sso;
import com.pcc.request.InsertDataRequest;
import com.pcc.response.ApiResponse;
import com.pcc.response.ResponseData;

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
            data.setResult(sso);
            response.setResponseMessage("กรอกข้อมูลเรียบร้อย");
            response.setResponseData(data);
            return ResponseEntity.ok().body(response);
        } catch (Exception e) {
            response.setResponseMessage(e.getMessage());
            return ResponseEntity.internalServerError().body(response);
        }
    }
}
