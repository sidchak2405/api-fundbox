package com.fundbox.repository;

import com.fundbox.model.FundBox;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface FundBoxRepository extends CrudRepository<FundBox, UUID> {}
