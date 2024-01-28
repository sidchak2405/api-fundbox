package com.fundbox.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.UUID;

@Entity
public class PaymentCycle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID guid;
    private UUID payeeMemberGuid;

    private UUID fundBoxGuid;
    private BigDecimal amount;

    private ZonedDateTime startDate;
    private ZonedDateTime endDate;

    private ZonedDateTime createdDate;


    private PaymentCycle() {}

    public PaymentCycle(UUID payeeMemberGuid, UUID fundBoxGuid, BigDecimal amount, ZonedDateTime startDate, ZonedDateTime endDate, ZonedDateTime createdDate) {
        this.payeeMemberGuid = payeeMemberGuid;
        this.fundBoxGuid = fundBoxGuid;
        this.amount = amount;
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

    public UUID getPayeeMemberGuid() {
        return payeeMemberGuid;
    }

    public void setPayeeMemberGuid(UUID payeeMemberGuid) {
        this.payeeMemberGuid = payeeMemberGuid;
    }

    public UUID getFundBoxGuid() {
        return fundBoxGuid;
    }

    public void setFundBoxGuid(UUID fundBoxGuid) {
        this.fundBoxGuid = fundBoxGuid;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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
