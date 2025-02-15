package java2024.oopinjava.finals.discount.retake;

public class DiscountRate2 {
    public static final double SERVICE_DISCOUNT_PREMIUM = 0.02;
    public static final double SERVICE_DISCOUNT_GOLD = 0.15;
    public static final double SERVICE_DISCOUNT_SILVER = 0.1;
    public static final double PRODUCT_DISCOUNT_PREMIUM = 0.1;
    public static final double PRODUCT_DISCOUNT_GOLD = 0.1;
    public static final double PRODUCT_DISCOUNT_SILVER = 0.1;

    public static double getServiceDiscountRate(String type) {
        switch(type.toLowerCase()) {
            case "premium": return SERVICE_DISCOUNT_PREMIUM;
            case "gold": return SERVICE_DISCOUNT_GOLD;
            case "silver": return SERVICE_DISCOUNT_SILVER;
            default: return 0.0;
        }
    }

    public static double getProductDiscountRate(String type) {
        switch(type.toLowerCase()) {
            case "premium": return PRODUCT_DISCOUNT_PREMIUM;
            case "gold": return PRODUCT_DISCOUNT_GOLD;
            case "silver": return PRODUCT_DISCOUNT_SILVER;
            default: return 0.0;
        }
    }

}