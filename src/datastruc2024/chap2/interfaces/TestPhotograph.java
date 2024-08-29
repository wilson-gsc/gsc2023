package datastruc2024.chap2.interfaces;

public class TestPhotograph {

    public static void main(String[] args) {
        // Create instances of Photograph
        Photograph photo1 = new Photograph("Sunset over the mountains", 5000, true);
        Photograph photo2 = new Photograph("Black and white portrait", 3000, false);

        // Display details using Sellable methods
        displaySellableItem(photo1);
        displaySellableItem(photo2);
    }

    // Method to display information about a Sellable item
    public static void displaySellableItem(Sellable item) {
        System.out.println("Item Description: " + item.description());
        System.out.println("List Price: " + item.listPrice() + " cents");
        System.out.println("Lowest Price: " + item.lowestPrice() + " cents");
        if (item instanceof Photograph) {
            Photograph photo = (Photograph) item;
            System.out.println("Is the photograph in color? " + (photo.isColor() ? "Yes" : "No"));
        }
        System.out.println();
    }
}

