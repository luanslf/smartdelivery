package br.com.javadevweek.smartdelivery.dto;

public record CreateCustomerRequest(String name, String phone, String email, String password, String zipCode) {}
