package com.fundbox.controller;

import com.fundbox.model.PaymentCycleLine;
import com.fundbox.repository.PaymentCycleLineRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/payment-cycle-lines")
public class PaymentCycleLineController {
    private final PaymentCycleLineRepository paymentCycleLineRepository;

    public PaymentCycleLineController(PaymentCycleLineRepository paymentCycleLineRepository) {
        this.paymentCycleLineRepository = paymentCycleLineRepository;
    }

    @GetMapping("/{guid}")
    public PaymentCycleLine getByGuid(@PathVariable UUID guid) {
        return this.paymentCycleLineRepository.findById(guid).orElseThrow(() -> new RuntimeException("PaymentCycleLineNotFound"));
    }

    @GetMapping("")
    public Iterable<PaymentCycleLine> getAll() {
        return this.paymentCycleLineRepository.findAll();
    }
}
