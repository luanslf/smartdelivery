package br.com.javadevweek.smartdelivery.service;

import br.com.javadevweek.smartdelivery.dto.CreateUserRequest;
import br.com.javadevweek.smartdelivery.entity.User;
import br.com.javadevweek.smartdelivery.mapper.UserMapper;
import br.com.javadevweek.smartdelivery.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CreateUserUseCase {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public CreateUserUseCase(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User execute(CreateUserRequest request) {
        var existing = userRepository.findByEmail(request.email());
        if (existing.isPresent()) {
            throw new IllegalArgumentException("User already exists!");
        }

        var password = passwordEncoder.encode(request.password());
        var user = UserMapper.requestToUser(request, password);
        return userRepository.save(user);
    }
}
