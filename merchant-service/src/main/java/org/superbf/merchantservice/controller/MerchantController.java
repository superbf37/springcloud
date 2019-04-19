package org.superbf.merchantservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.superbf.merchantservice.service.ApiPayService;

@RestController
@RequestMapping("/merchant")
public class MerchantController {
    @Autowired
    private ApiPayService apiPayService;

    @RequestMapping("/details")
    public String getMerchant(){
        return "测试商户";
    }


    @RequestMapping("/testConsume")
    public String consumePayService(){
        String result = apiPayService.scanPayService();
        return result;
    }
}
