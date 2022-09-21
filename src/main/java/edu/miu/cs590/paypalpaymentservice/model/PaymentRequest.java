package edu.miu.cs590.paypalpaymentservice.model;

import lombok.Data;

@Data
public class PaymentRequest {
    private Long userId;
    private String paypalId;
    private Double balance;
}
