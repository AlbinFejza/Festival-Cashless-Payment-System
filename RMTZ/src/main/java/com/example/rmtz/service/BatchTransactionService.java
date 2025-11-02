package com.example.rmtz.service;

import com.example.rmtz.dto.TransactionRequest;
import com.example.rmtz.dto.TransactionResponse;

import java.util.List;

public interface BatchTransactionService {
    List<TransactionResponse> processBatch(List<TransactionRequest>requests);
}
