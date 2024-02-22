package org.example.tahmiinbackend.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/auth/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/approve/{userId}")
    public ResponseEntity<String> approveUser(@PathVariable Long userId){
        userService.userApprove(userId);
        return ResponseEntity.ok("User kaydı onaylandı.");
    }
}
