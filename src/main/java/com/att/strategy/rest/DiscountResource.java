package com.att.strategy.rest;

import com.att.strategy.service.discount.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.att.strategy.dto.*;

@RestController
@RequestMapping("/discount")
public class DiscountResource {

    @Autowired
    private DiscountService discountService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public double calculator(@RequestBody PostDTO dto) {

        return this.discountService.calculateDiscountedAmount(dto);
    }
}
