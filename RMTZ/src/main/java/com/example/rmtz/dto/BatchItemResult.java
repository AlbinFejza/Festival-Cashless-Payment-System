package com.example.rmtz.dto;

import lombok.*;

import java.time.Instant;
import java.util.UUID;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class BatchItemResult {
private String requestId;
private String status;
private UUID txId;
private Integer balance;
private String errorcode;
private String message;
private Instant serverTs;

}
