package com.att.strategy.service.discount.strategy;

import org.springframework.stereotype.Component;

@Component
public class FixedDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount - 10.0; // Desconto fixo de 10 unidades monetárias
    }
}
