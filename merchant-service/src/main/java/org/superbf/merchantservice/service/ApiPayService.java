package org.superbf.merchantservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "pay-service")
public interface ApiPayService {
    @GetMapping("/pay/scanPay")
    String scanPayService();
}
