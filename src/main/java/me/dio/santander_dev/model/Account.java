package me.dio.santander_dev.model;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String number;
    private String agency;
    @Column(precision = 2, scale = 13)
    private BigDecimal balance;
    @Column(name="Acc_limit" ,precision = 2, scale = 13)
    private BigDecimal limit;
}
