package com.fundbox.repository;

import com.fundbox.model.PaymentCycle;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface PaymentCycleRepository extends CrudRepository<PaymentCycle, UUID> {}
