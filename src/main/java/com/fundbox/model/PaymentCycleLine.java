package com.fundbox.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.UUID;

@Entity
public class PaymentCycleLine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID guid;
    private UUID paymentCycleGuid;

    private UUID payerMemberGuid;
    private BigDecimal amount;
    private BigDecimal amountBalance;

    private ZonedDateTime startDate;
    private ZonedDateTime endDate;

    private ZonedDateTime createdDate;


    private PaymentCycleLine() {}

    public PaymentCycleLine(UUID paymentCycleGuid, UUID payerMemberGuid, BigDecimal amount, BigDecimal amountBalance, ZonedDateTime startDate, ZonedDateTime endDate, ZonedDateTime createdDate) {
        this.paymentCycleGuid = paymentCycleGuid;
        this.payerMemberGuid = payerMemberGuid;
        this.amount = amount;
        this.amountBalance = amountBalance;
        this.startDate = startDate;
        this.endDate = endDate;
        this.createdDate = createdDate;
    }

    public UUID getGuid() {
        return guid;
    }

    public void setGuid(UUID guid) {
        this.guid = guid;
    }

    public UUID getPaymentCycleGuid() {
        return paymentCycleGuid;
    }

    public void setPaymentCycleGuid(UUID paymentCycleGuid) {
        this.paymentCycleGuid = paymentCycleGuid;
    }

    public UUID getPayerMemberGuid() {
        return payerMemberGuid;
    }

    public void setPayerMemberGuid(UUID payerMemberGuid) {
        this.payerMemberGuid = payerMemberGuid;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmountBalance() {
        return amountBalance;
    }

    public void setAmountBalance(BigDecimal amountBalance) {
        this.amountBalance = amountBalance;
    }

    public ZonedDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(ZonedDateTime startDate) {
        this.startDate = startDate;
    }

    public ZonedDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(ZonedDateTime endDate) {
        this.endDate = endDate;
    }

    public ZonedDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(ZonedDateTime createdDate) {
        this.createdDate = createdDate;
    }
}
