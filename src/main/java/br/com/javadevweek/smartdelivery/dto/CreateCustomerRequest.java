package br.com.javadevweek.smartdelivery.dto;

public class CreateCustomerRequest {
    private String name;
    private String phone;
    private String email;
    private String password;
    private String zipCode;

    public CreateCustomerRequest(String name, String phone, String email, String password, String zipCode) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.zipCode = zipCode;
    }

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
