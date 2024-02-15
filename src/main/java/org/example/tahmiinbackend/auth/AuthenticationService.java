package org.example.tahmiinbackend.auth;

import lombok.RequiredArgsConstructor;
import org.example.tahmiinbackend.config.JwtService;
import org.example.tahmiinbackend.user.Role;
import org.example.tahmiinbackend.user.User;
import org.example.tahmiinbackend.user.UserRepository;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public AuthenticationResponse register(RegisterRequest request) {
        if (repository.findUserByUserName(request.getUserName()).isPresent()) {
            throw new RuntimeException("Bu kullanıcı adı zaten kullanılıyor.");
        }

        var user = User.builder()
                .name(request.getName())
                .lastName(request.getLastName())
                .userEmail(request.getUserEmail())
                .userName(request.getUserName())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.USER)
                .isUserApproved(false)
                .build();
        repository.save(user);
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse
                .builder()
                .token(jwtToken)
                .build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUserName(),
                        request.getPassword()
                )
        );
        var user = repository.findUserByUserName(request.getUserName())
                .orElseThrow();
        var jwtToken = jwtService.generateToken(user);

        AuthenticationResponse response = AuthenticationResponse
                .builder()
                .token(jwtToken)
                .userId(user.getUserId())
                .isUserApproved(user.getIsUserApproved())
                .build();
        return response;
    }
}
