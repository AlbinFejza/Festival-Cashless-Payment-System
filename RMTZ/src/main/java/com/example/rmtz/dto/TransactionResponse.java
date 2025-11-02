package com.example.rmtz.dto;
import jakarta.validation.constraints.*;

import java.util.UUID;


public class TransactionResponse {

    @NotBlank(message = "Status can't be empty")
    private String status;

    @NotEmpty(message = "Balance cant be empty")
    @Positive(message = "Balance must be positive")
    private Integer balance;

    @NotBlank(message = "Transaction ID is required")
    private String txId;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId;
    }
}
