package comprog12.finals.exam.invoice;

public class TestInvoiceItem {
	public static void main(String[] args) {
		// Test constructor and toString()
		System.out.println("Create InvoiceItem inv1 instance using constructor");
		InvoiceItem inv1 = new InvoiceItem("A101", "Pen Red", 888, 0.08);
		System.out.println("\n"+inv1);  // toString();

		// Test Setters and Getters
		System.out.println("\ninv1 instance update qty to 999 and unitPrice to 0.99 ");
		inv1.setQty(999);
		inv1.setUnitPrice(0.99);
		System.out.println("\n"+inv1);  // toString();
		System.out.println("\nId: " + inv1.getId());
		System.out.println("Desc: " + inv1.getDesc());
		System.out.println("Qty: " + inv1.getQty());
		System.out.println("Unit Price: " + inv1.getUnitPrice());

		// Test getTotal()
		System.out.println("\nTotal: " + inv1.getTotal());
	}
}
