package com.example.rmtz.service;

import com.example.rmtz.dto.TagView;
import com.example.rmtz.dto.TransactionRequest;
import com.example.rmtz.dto.TransactionResponse;

public interface TransactionService {
    TransactionResponse process(TransactionRequest request);
    TagView getTag(String uid);
}
