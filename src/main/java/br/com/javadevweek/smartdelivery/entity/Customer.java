package br.com.javadevweek.smartdelivery.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Table(name = "customers")
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String phone;

    @Column(unique = true)
    private String address;
    private String zipCode;

    @Column(name = "user_id")
    private UUID userId;

    @OneToOne(fetch =  FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;

    public Customer() {}

    public Customer(String phone, String zipCode,  UUID userId) {
        this.phone = phone;
        this.zipCode = zipCode;
        this.userId = userId;
    }

    public UUID getId() {
        return id;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}
