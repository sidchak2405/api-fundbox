package com.fundbox.controller;

import com.fundbox.model.Member;
import com.fundbox.repository.MemberRepository;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/members")
public class MemberController {
    private final MemberRepository memberRepository;

    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @PostMapping("")
    public Member create(@RequestBody Member member) {
        return this.memberRepository.save(member);
    }


    @GetMapping("/{guid}")
    public Member getByGuid(@PathVariable UUID guid) {
        return this.memberRepository.findById(guid).orElseThrow(() -> new RuntimeException("MemberNotFound"));
    }

    @GetMapping("")
    public Iterable<Member> getAll() {
        return this.memberRepository.findAll();
    }
}
