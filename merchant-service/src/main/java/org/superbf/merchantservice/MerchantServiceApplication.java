package org.superbf.merchantservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 商户服务
 *
 * @author zhangcheng
 * @date 2019/04/19
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class MerchantServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MerchantServiceApplication.class, args);
    }

}
