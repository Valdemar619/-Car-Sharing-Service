package com.example.carsharingservice.controller;

import com.example.carsharingservice.dto.request.UserLoginRequestDto;
import com.example.carsharingservice.dto.request.UserRegisterRequestDto;
import com.example.carsharingservice.dto.response.JwtAuthenticationResponseDto;
import com.example.carsharingservice.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity<JwtAuthenticationResponseDto> register(@RequestBody
                                                                 UserRegisterRequestDto request) {
        return ResponseEntity.ok(authenticationService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<JwtAuthenticationResponseDto> login(@RequestBody
                                                              UserLoginRequestDto request) {
        return ResponseEntity.ok(authenticationService.login(request));
    }
}
