package java2024.oopinjava.finals.discount;

public class DiscountRate {
    public static final double SERVICE_DISCOUNT_PREMIUM = 0.2;
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
    
    public static void main(String[] args) {
    	System.out.println("Dicount Rate Test\n");
        String customerType = "Premium";

        // Get the service discount rate for a Premium member
        double serviceDiscount = DiscountRate.getServiceDiscountRate(customerType); 
        System.out.println("Service discount for " + customerType + ": " + String.format("%.0f", (serviceDiscount * 100)) + "%");

        // Get the product discount rate for a Premium member
        double productDiscount = DiscountRate.getProductDiscountRate(customerType);
        System.out.println("Product discount for " + customerType + ": " + String.format("%.0f", (productDiscount * 100)) + "%");
        
        customerType = "Gold";

        // Get the service discount rate for a Gold member
        serviceDiscount = DiscountRate.getServiceDiscountRate(customerType); 
        System.out.println("Service discount for " + customerType + ": " + String.format("%.0f", (serviceDiscount * 100)) + "%");

        // Get the product discount rate for a Gold member
        productDiscount = DiscountRate.getProductDiscountRate(customerType);
        System.out.println("Product discount for " + customerType + ": " + String.format("%.0f", (productDiscount * 100)) + "%");
        
        customerType = "Silver";

        // Get the service discount rate for a Silver member
        serviceDiscount = DiscountRate.getServiceDiscountRate(customerType); 
        System.out.println("Service discount for " + customerType + ": " + String.format("%.0f", (serviceDiscount * 100)) + "%");

        // Get the product discount rate for a Silver member
        productDiscount = DiscountRate.getProductDiscountRate(customerType);
        System.out.println("Product discount for " + customerType + ": " + String.format("%.0f", (productDiscount * 100)) + "%");
        
        customerType = "Non Member";

        // Get the service discount rate for a Non Member member
        serviceDiscount = DiscountRate.getServiceDiscountRate(customerType); 
        System.out.println("Service discount for " + customerType + ": " + String.format("%.0f", (serviceDiscount * 100)) + "%");

        // Get the product discount rate for a Non Member member
        productDiscount = DiscountRate.getProductDiscountRate(customerType);
        System.out.println("Product discount for " + customerType + ": " + String.format("%.0f", (productDiscount * 100)) + "%");
    }

}