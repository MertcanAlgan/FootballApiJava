package org.example.tahmiinbackend.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("auth/user/approve/{userId}")
    public ResponseEntity<String> approveUser(@PathVariable Long userId){
        userService.userApprove(userId);
        return ResponseEntity.ok("User kaydı onaylandı.");
    }
    @PutMapping("user/{userId}/change-password")
    public ResponseEntity<String> changePassword(@PathVariable Long userId, @RequestBody String newPassword) {
        userService.changePasswordByUserId(userId, newPassword);
        System.out.println(newPassword);
        return new ResponseEntity<>("Şifre başarıyla değiştirildi.", HttpStatus.OK);
    }
}
