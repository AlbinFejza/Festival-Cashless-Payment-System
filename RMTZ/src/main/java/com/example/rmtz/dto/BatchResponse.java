package com.example.rmtz.dto;

import lombok.*;

import java.util.List;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class BatchResponse {
private List<BatchItemResult>results;
}
