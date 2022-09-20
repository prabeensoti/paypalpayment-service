package edu.miu.cs590.paypalpaymentservice.controller;

import edu.miu.cs590.paypalpaymentservice.model.PaymentRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class PaypalPaymentController {

    @PostMapping("/processPayment")
    public ResponseEntity<String> makePayment(@RequestBody PaymentRequest paymentRequest){
        return new ResponseEntity<>("Payment successful with UID " + UUID.randomUUID().toString(), HttpStatus.OK);
    }
}
