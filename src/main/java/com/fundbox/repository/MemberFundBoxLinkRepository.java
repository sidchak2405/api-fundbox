package com.fundbox.repository;

import com.fundbox.model.MemberFundBoxLink;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface MemberFundBoxLinkRepository extends CrudRepository<MemberFundBoxLink, UUID> {}
