package com.example.rmtz.dto;

import lombok.*;

import java.time.Instant;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ApiError {
    private String code;
    private String message;
    private Instant timestamp;
    private String traceId;
}
