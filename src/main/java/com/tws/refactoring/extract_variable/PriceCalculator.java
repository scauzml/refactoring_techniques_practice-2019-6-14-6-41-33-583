package com.tws.refactoring.extract_variable;

public class PriceCalculator {

    public static final int shippingCostMax = 500;
    public static final double shippingDiscount = 0.05;
    public static final double shippingDiscountMax = 100.0;
    public static final double shppingRate = 0.1;

    double getPgetrice(int quantity, int itemPrice) {
        // Price consists of: base price - discount + shipping cost
        int basePrice = quantity * itemPrice;
        double discount = Math.max(0, quantity - shippingCostMax) * itemPrice * shippingDiscount;
        double shippingCost = Math.min(quantity * itemPrice * shppingRate, shippingDiscountMax);
        return basePrice - discount + shippingCost;
    }
}
