package com.fundbox.controller;

import com.fundbox.model.FundBox;
import com.fundbox.repository.FundBoxRepository;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/fund-boxes")
public class FundBoxController {
    private final FundBoxRepository fundBoxRepository;

    public FundBoxController(FundBoxRepository fundBoxRepository) {
        this.fundBoxRepository = fundBoxRepository;
    }

    @PostMapping("")
    public FundBox create(@RequestBody FundBox fundBox) {
        return this.fundBoxRepository.save(fundBox);
    }

    @GetMapping("/{guid}")
    public FundBox getByGuid(@PathVariable UUID guid) {
        return this.fundBoxRepository.findById(guid).orElseThrow(() -> new RuntimeException("FundBoxNotFound"));
    }

    @GetMapping("")
    public Iterable<FundBox> getAll() {
        return this.fundBoxRepository.findAll();
    }
}
