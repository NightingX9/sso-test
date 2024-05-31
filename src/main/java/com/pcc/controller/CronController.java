package com.pcc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CronController {

    @Value("${cron.expression}")
    private String cronExpression;

    @PutMapping("/cron")
    public ResponseEntity<String> updateCronExpression(@RequestParam String newCronExpression) {
        cronExpression = newCronExpression;
        return new ResponseEntity<>("Cron expression updated successfully", HttpStatus.OK);
    }
}
