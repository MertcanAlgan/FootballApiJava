package org.example.tahmiinbackend.forgotPasswordRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api")
@CrossOrigin(origins = "http://localhost:3000")
public class ForgotPasswordRequestController {
    private final ForgotPasswordRequestService forgotPasswordRequestService;

    public ForgotPasswordRequestController(ForgotPasswordRequestService forgotPasswordRequestService) {
        this.forgotPasswordRequestService = forgotPasswordRequestService;
    }

    @PostMapping("auth/forgot-password")
    public void processForgotPasswordRequest(@RequestBody Map<String, String> request) {
        String userEmail = request.get("userEmail");
        forgotPasswordRequestService.processForgotPasswordRequest(userEmail);
    }
    @PutMapping("forgot-password/{userId}")
    public ResponseEntity<String> changePasswordForgot(@PathVariable("userId") Long userId, @RequestBody String newPassword){
        forgotPasswordRequestService.changePasswordForgot(userId,newPassword);
        return ResponseEntity.ok("Şifre başarıyla değiştirildi.");
    }
}
