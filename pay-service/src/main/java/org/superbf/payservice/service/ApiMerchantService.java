package org.superbf.payservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "merchant-service")
public interface ApiMerchantService {
    @GetMapping("/merchant/details")
    String  getMerchant();
}
