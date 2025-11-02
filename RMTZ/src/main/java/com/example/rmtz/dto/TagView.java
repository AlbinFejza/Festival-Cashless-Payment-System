package com.example.rmtz.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class TagView {
    @NotBlank(message = "ID is required ")
    private String uid;

    @Positive(message = "Balance must be positive")
    @NotNull(message = "Balance can't be empty")
    private int balanceMkd;

    @NotNull(message = "Account status is required")
    private  AccountStatus status;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public int getBalanceMkd() {
        return balanceMkd;
    }

    public void setBalanceMkd(int balanceMkd) {
        this.balanceMkd = balanceMkd;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public enum AccountStatus{ACTIVE, LOCKED, SUSPENDED}
}
