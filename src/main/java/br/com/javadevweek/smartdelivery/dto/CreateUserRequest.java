package br.com.javadevweek.smartdelivery.dto;

import br.com.javadevweek.smartdelivery.enums.UserRole;

public record CreateUserRequest(String name, String email, String password, UserRole role) { }
