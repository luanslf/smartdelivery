package br.com.javadevweek.smartdelivery.mapper;

import br.com.javadevweek.smartdelivery.dto.CreateUserRequest;
import br.com.javadevweek.smartdelivery.entity.User;

public class UserMapper {
    public static User requestToUser(CreateUserRequest request, String password) {
        return new User(request.name(), request.email(), password, request.role());
    }
}
