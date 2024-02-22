package org.example.tahmiinbackend.auth;

import lombok.RequiredArgsConstructor;
import org.example.tahmiinbackend.mail.EmailSenderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {


    private final AuthenticationService service;
    private final EmailSenderService emailSenderService;


    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request) {
        AuthenticationResponse response = service.register(request);
        emailSenderService.sendActivationEmail(request.getUserEmail());
        return ResponseEntity.ok(response);
    }
    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request
    ){
        return ResponseEntity.ok(service.authenticate(request));
    }

}
