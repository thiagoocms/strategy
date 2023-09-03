package com.att.strategy.service.discount;

import com.att.strategy.service.discount.strategy.DiscountStrategy;
import com.att.strategy.service.discount.strategy.FixedDiscountStrategy;
import com.att.strategy.service.discount.strategy.NoDiscountStrategy;
import com.att.strategy.service.discount.strategy.PercentageDiscountStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import com.att.strategy.dto.*;

import java.util.Objects;

@Service
public class DiscountService {

    @Lazy
    @Autowired
    private DiscountStrategy discountStrategy;

    public double calculateDiscountedAmount(PostDTO dto) {

        if (Objects.nonNull(dto.getStrategy())) {
            switch (dto.getStrategy()) {
                case "fixed" -> this.discountStrategy = new FixedDiscountStrategy();
                case "percentage" -> this.discountStrategy = new PercentageDiscountStrategy();
            }
        }
        return discountStrategy.applyDiscount(dto.getAmount());
    }
}
