package datastruc2024.chap2.interfaces;

public class TestBoxedItem {

    public static void main(String[] args) {
        // Create instances of BoxedItem
        BoxedItem item1 = new BoxedItem("Smartphone", 30000, 500, false);
        BoxedItem item2 = new BoxedItem("Chemicals", 15000, 2000, true);

        // Set box dimensions for the items
        item1.setBox(15, 8, 2);  // height, width, depth in cm
        item2.setBox(30, 20, 10);

        // Display details using Sellable and Transportable methods
        displayItemDetails(item1);
        displayItemDetails(item2);
    }

    // Method to display information about a Sellable and Transportable item
    public static void displayItemDetails(BoxedItem item) {
        System.out.println("Item Description: " + item.description());
        System.out.println("List Price: " + item.listPrice() + " cents");
        System.out.println("Lowest Price: " + item.lowestPrice() + " cents");
        System.out.println("Weight: " + item.weight() + " grams");
        System.out.println("Is Hazardous: " + (item.isHazardous() ? "Yes" : "No"));
        System.out.println("Insured Value: " + item.insuredValue() + " cents");
        System.out.println();
    }
}

