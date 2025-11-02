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
@Table(name = "devices")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Device {
    @Id
    @Column(name = "device_id")
    private String deviceId;

    @Column(nullable = false)
    private String role;


    private Boolean enabled=true;

    @Column(name = "last_seen")
    private Instant lastSeen=Instant.now();
}
