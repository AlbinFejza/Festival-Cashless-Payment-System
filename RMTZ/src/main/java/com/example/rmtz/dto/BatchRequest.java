package com.example.rmtz.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.util.List;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class BatchRequest {
    @NotEmpty
    private List<TransactionRequest>requests;
}
