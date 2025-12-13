package br.com.javadevweek.smartdelivery.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Table(name = "customers")
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String phone;
    @Column(unique = true)
    private String email;
    private String password;
    private String address;
    private String zipCode;

    public Customer() {}

    public Customer(String name, String phone, String email, String password, String zipCode) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.zipCode = zipCode;
    }

    public UUID getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}
