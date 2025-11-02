package com.example.rmtz.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Entity
@Table(name = "tx_ledger",uniqueConstraints = {@UniqueConstraint(columnNames = {"uid","request_id"})
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TxLedger {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private String uid;

    @Column(name = "device_id",nullable = false)
    private String deviceId;

    @Column(name = "vendor_id")
    private String vendorId;

    @Column(nullable = false)
    private String type;

    @Column(name = "amount_denars",nullable = false)
    private Integer amountDenars;

    @Column(name = "balance_after",nullable = false)
    private Integer balanceAfter;

    @Column(name = "ts_device",nullable = false)
    private Instant tsDevice;

    @Column(name = "ts_server",nullable = false)
    private  Instant tsServer=Instant.now();

    @Column(name = "request_id",nullable = false)
    private String requestId;

}
