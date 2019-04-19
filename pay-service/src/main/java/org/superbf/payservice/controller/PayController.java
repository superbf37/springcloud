package org.superbf.payservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pay")

public class PayController {
    @RequestMapping("/scanPay")
    public String merchantPay(){
        return "商户支付";
    }
}
