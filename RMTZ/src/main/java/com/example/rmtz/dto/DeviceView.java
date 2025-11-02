package com.example.rmtz.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
public class DeviceView {

    @NotBlank(message = "ID is required!")
    private String uid;

    @NotEmpty(message = "Vendor ID is required")
    private String vendorId;

    private boolean enabled;
}
