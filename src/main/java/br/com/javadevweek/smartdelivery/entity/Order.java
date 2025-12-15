package br.com.javadevweek.smartdelivery.entity;

import br.com.javadevweek.smartdelivery.enums.OrderStatus;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Table(name = "orders")
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "customer_id")
    private UUID customerId;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false, insertable = false, updatable = false)
    private Customer customer;

    @ManyToMany
    @JoinTable(
            name = "orders_products",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products;

    @Enumerated(EnumType.STRING)
    private OrderStatus status = OrderStatus.CREATED;

    public Order() {}

    public UUID getId() {
        return id;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
