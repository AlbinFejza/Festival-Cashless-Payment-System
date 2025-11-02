package com.example.rmtz.service;

import com.example.rmtz.dto.DeviceView;

import java.util.Optional;

public interface DeviceService {
    void verify(String deviceId,String apiKey);

    Optional<DeviceView> viewDevice(String device);

}
