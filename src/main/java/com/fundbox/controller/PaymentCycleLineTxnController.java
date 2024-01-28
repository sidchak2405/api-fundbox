package com.fundbox.controller;

import com.fundbox.model.PaymentCycleLineTxn;
import com.fundbox.repository.PaymentCycleLineTxnRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/payment-cycle-line-txns")
public class PaymentCycleLineTxnController {
    private final PaymentCycleLineTxnRepository paymentCycleLineTxnRepository;

    public PaymentCycleLineTxnController(PaymentCycleLineTxnRepository paymentCycleLineTxnRepository) {
        this.paymentCycleLineTxnRepository = paymentCycleLineTxnRepository;
    }

    @GetMapping("/{guid}")
    public PaymentCycleLineTxn getByGuid(@PathVariable UUID guid) {
        return this.paymentCycleLineTxnRepository.findById(guid).orElseThrow(() -> new RuntimeException("PaymentCycleLineTxnNotFound"));
    }

    @GetMapping("")
    public Iterable<PaymentCycleLineTxn> getAll() {
        return this.paymentCycleLineTxnRepository.findAll();
    }
}
