package com.safepassword.controller;

import com.safepassword.dto.DtoPassword;
import com.safepassword.dto.DtoResponse;
import com.safepassword.service.ServiceValidatePassword;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerSafepassword {

    @PostMapping("/validate-password")
    public ResponseEntity<DtoResponse> postSafePassword(@RequestBody DtoPassword oPassword) {
        HttpStatus statusResponse = HttpStatus.BAD_REQUEST;
        String responseMessage = "The password does not cover all the necessary requirements.";
        ServiceValidatePassword oServiceValidatePassword = new ServiceValidatePassword();

        if (oServiceValidatePassword.validatePasswordIsSafe(oPassword.password())) {
            statusResponse = HttpStatus.NO_CONTENT;
            responseMessage = "";
        }

        DtoResponse oResponse = new DtoResponse(statusResponse, responseMessage);
        return ResponseEntity.status(statusResponse).body(oResponse);
    }}
