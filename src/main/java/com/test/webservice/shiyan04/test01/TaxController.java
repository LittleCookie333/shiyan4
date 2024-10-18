package com.test.webservice.shiyan04.test01;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tax")
@CrossOrigin(origins = "http://localhost:63342") // 允许的来源
public class TaxController {

    private final TaxService taxService;

    public TaxController(TaxService taxService) {
        this.taxService = taxService;
    }

    @PostMapping("/calculate")
    public double calculateTax(@RequestBody double income) {
        return taxService.calculateTax(income);
    }
}