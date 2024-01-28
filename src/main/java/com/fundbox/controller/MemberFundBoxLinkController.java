package com.fundbox.controller;

import com.fundbox.model.MemberFundBoxLink;
import com.fundbox.repository.MemberFundBoxLinkRepository;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/member-fund-box-links")
public class MemberFundBoxLinkController {
    private final MemberFundBoxLinkRepository memberFundBoxLinkRepository;

    public MemberFundBoxLinkController(MemberFundBoxLinkRepository memberFundBoxLinkRepository) {
        this.memberFundBoxLinkRepository = memberFundBoxLinkRepository;
    }

    @GetMapping("/{guid}")
    public MemberFundBoxLink getByGuid(@PathVariable UUID guid) {
        return this.memberFundBoxLinkRepository.findById(guid).orElseThrow(() -> new RuntimeException("MemberFundBoxNotFound"));
    }

    @GetMapping("")
    public Iterable<MemberFundBoxLink> getAll() {
        return this.memberFundBoxLinkRepository.findAll();
    }
}
