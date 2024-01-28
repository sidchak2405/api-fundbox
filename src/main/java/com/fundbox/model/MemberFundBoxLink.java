package com.fundbox.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.ZonedDateTime;
import java.util.UUID;

@Entity
public class MemberFundBoxLink {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID guid;
    private UUID memberGuid;
    private UUID fundBoxGuid;
    private ZonedDateTime createdDate;


    private MemberFundBoxLink() {}

    public MemberFundBoxLink(UUID memberGuid, UUID fundBoxGuid, ZonedDateTime createdDate) {
        this.memberGuid = memberGuid;
        this.fundBoxGuid = fundBoxGuid;
        this.createdDate = createdDate;
    }

    public UUID getGuid() {
        return guid;
    }

    public void setGuid(UUID guid) {
        this.guid = guid;
    }

    public UUID getMemberGuid() {
        return memberGuid;
    }

    public void setMemberGuid(UUID memberGuid) {
        this.memberGuid = memberGuid;
    }

    public UUID getFundBoxGuid() {
        return fundBoxGuid;
    }

    public void setFundBoxGuid(UUID fundBoxGuid) {
        this.fundBoxGuid = fundBoxGuid;
    }

    public ZonedDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(ZonedDateTime createdDate) {
        this.createdDate = createdDate;
    }
}
