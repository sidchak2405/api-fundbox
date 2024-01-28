package com.fundbox.repository;

import com.fundbox.model.PaymentCycleLineTxn;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PaymentCycleLineTxnRepository extends CrudRepository<PaymentCycleLineTxn, UUID> {}
