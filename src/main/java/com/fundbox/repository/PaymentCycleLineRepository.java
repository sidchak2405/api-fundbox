package com.fundbox.repository;

import com.fundbox.model.PaymentCycleLine;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PaymentCycleLineRepository extends CrudRepository<PaymentCycleLine, UUID> {}
