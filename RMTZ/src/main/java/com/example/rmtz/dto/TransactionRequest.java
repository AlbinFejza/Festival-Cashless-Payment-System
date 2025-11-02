package com.example.rmtz.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

import java.time.Instant;

public class TransactionRequest {
    @NotBlank(message="Request ID is required")
    private String requestId;

    @NotBlank(message ="Tag UID is required")
    @Pattern(regexp = "^[0-9A-Fa-f]+$", message = "UID must be a hex string")
    private String uid;

    @NotBlank(message = "Device ID is required")
    private String deviceID;

    @NotBlank(message = "Vendor ID is required")
    private String vendorID;

    @NotNull(message = "Transaction type is required ")
    private TxType type;

    @NotNull(message = "Account is required")
    @Positive(message = "Amount must be positive")
    private Integer amountDenars;

    @NotNull(message = "Device timestamp is required")
    private Instant tsDevice;

    public String getRequestId(){return requestId;}
    public void setRequestId(String requestId){this.requestId=requestId;}

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getVendorID() {
        return vendorID;
    }

    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }

    public TxType getType() {
        return type;
    }

    public void setType(TxType type) {
        this.type = type;
    }

    public Integer getAmountDenars() {
        return amountDenars;
    }

    public void setAmountDenars(Integer amountDenars) {
        this.amountDenars = amountDenars;
    }

    public Instant getTsDevice() {
        return tsDevice;
    }

    public void setTsDevice(Instant tsDevice) {
        this.tsDevice = tsDevice;
    }
    public enum TxType{SALE, TOPUP, REFUND}
}
