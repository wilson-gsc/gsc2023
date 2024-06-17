package comprog12.finals.exam.invoice;

public class InvoiceItem {
    // Private fields
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    
    // Constructor
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    
    // Getter methods
    public String getId() {
        return id;
    }
    
    public String getDesc() {
        return desc;
    }
    
    public int getQty() {
        return qty;
    }
    
    public double getUnitPrice() {
        return unitPrice;
    }
    
    // Setter methods
    public void setQty(int qty) {
        this.qty = qty;
    }
    
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    // Method to calculate the total price
    public double getTotal() {
        return unitPrice * qty;
    }
    
    // toString method
    @Override
    public String toString() {
        return "InvoiceItem{"
        		+ "\n\tId: " + id + ","
        				+ "\n\tDesc: " + desc + ","
        						+ "\n\tQty: " + qty + ","
        								+ "\n\tUnit Price: " + unitPrice + "\n}";
    }
}
