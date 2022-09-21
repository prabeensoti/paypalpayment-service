package edu.miu.cs590.paypalpaymentservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class PayPalServiceMVCConfigurer implements WebMvcConfigurer {
    @Autowired
    private PayPalServiceInterceptor payPalServiceInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(payPalServiceInterceptor);
    }
}
