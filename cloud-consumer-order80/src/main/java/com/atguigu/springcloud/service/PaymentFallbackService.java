package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import org.springframework.stereotype.Component;

/**
 * @author wanghaibo
 * @create 2020-07-05 18:15
 */
@Component
public class PaymentFallbackService implements PaymentFeignService {

    @Override
    public CommonResult getPaymentById(Long id) {
        return null;
    }

    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }


    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }
}