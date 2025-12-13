package br.com.javadevweek.smartdelivery.dto;

public class CreateCustomerRequest {
    private String name;
    private String phone;
    private String email;
    private String password;
    private String zipCode;

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getZipCode() {
        return zipCode;
    }
}
