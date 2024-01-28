package com.fundbox.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.UUID;

@Entity
public class PaymentCycleLineTxn {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID guid;
    private UUID paymentCycleLineGuid;
    private BigDecimal paymentAmount;
    private BigDecimal paymentDate;
    private ZonedDateTime createdDate;

    private PaymentCycleLineTxn() {}

    public PaymentCycleLineTxn(UUID paymentCycleLineGuid, BigDecimal paymentAmount, BigDecimal paymentDate, ZonedDateTime createdDate) {
        this.paymentCycleLineGuid = paymentCycleLineGuid;
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
        this.createdDate = createdDate;
    }

    public UUID getGuid() {
        return guid;
    }

    public void setGuid(UUID guid) {
        this.guid = guid;
    }

    public UUID getPaymentCycleLineGuid() {
        return paymentCycleLineGuid;
    }

    public void setPaymentCycleLineGuid(UUID paymentCycleLineGuid) {
        this.paymentCycleLineGuid = paymentCycleLineGuid;
    }

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public BigDecimal getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(BigDecimal paymentDate) {
        this.paymentDate = paymentDate;
    }

    public ZonedDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(ZonedDateTime createdDate) {
        this.createdDate = createdDate;
    }
}
