package com.example.rmtz.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Table(name = "accounts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    private String uid;

    @Column(name = "balance_denars", nullable = false)
    private Integer balance_denars=0;

    private String status="ACTIVE";

    @Column(name = "last_seen")
    private Instant lastSeen=Instant.now();
}
