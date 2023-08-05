package com.example.carsharingservice.service.impl;

import com.example.carsharingservice.model.Payment;
import com.example.carsharingservice.service.PaymentHandler;
import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentHandlerStrategy {
    @Autowired
    private List<PaymentHandler> paymentHandlers;

    public PaymentHandler getHandler(Payment.Type type) {
        return paymentHandlers.stream().filter(h -> h.isApplicable(type))
                .findFirst().orElseThrow(NoSuchElementException::new);
    }
}
