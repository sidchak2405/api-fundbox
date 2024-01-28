package com.fundbox.repository;

import com.fundbox.model.Member;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface MemberRepository extends CrudRepository<Member, UUID> {}
