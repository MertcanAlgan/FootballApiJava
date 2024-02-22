package org.example.tahmiinbackend.user;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public void userApprove(Long userId){
        boolean exists = userRepository.existsById(userId);
        if (!exists){
            throw new IllegalStateException(userId + "Böyle bir user yok");
        }
        try {
            userRepository.approveUser(userId);
        } catch (Exception e){
            throw new IllegalStateException("User Approve edilemiyor", e);
        }
    }

    public Optional<Long> getUserIdByUserEmail(String userEmail) {
        Optional<User> optionalUser = userRepository.findUserByUserEmail(userEmail);
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            return Optional.of(user.getUserId());
        } else {
            return Optional.empty();
        }
    }
}
