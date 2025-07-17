package com.safepassword.dto;

import org.springframework.http.HttpStatus;

public record DtoResponse(HttpStatus status, String message) {
}
