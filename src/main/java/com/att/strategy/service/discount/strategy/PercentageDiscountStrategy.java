package com.att.strategy.service.discount.strategy;

import org.springframework.stereotype.Component;

@Component
public class PercentageDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.2; // Desconto de 20%
    }
}
