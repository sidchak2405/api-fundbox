package com.fundbox.controller;

import com.fundbox.model.PaymentCycle;
import com.fundbox.repository.PaymentCycleRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/payment-cycles")
public class PaymentCycleController {
    private final PaymentCycleRepository paymentCycleRepository;

    public PaymentCycleController(PaymentCycleRepository paymentCycleRepository) {
        this.paymentCycleRepository = paymentCycleRepository;
    }

    @GetMapping("/{guid}")
    public PaymentCycle getByGuid(@PathVariable UUID guid) {
        return this.paymentCycleRepository.findById(guid).orElseThrow(() -> new RuntimeException("PaymentCycleNotFound"));
    }

    @GetMapping("")
    public Iterable<PaymentCycle> getAll() {
        return this.paymentCycleRepository.findAll();
    }
}
