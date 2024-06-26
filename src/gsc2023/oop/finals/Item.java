package gsc2023.oop.finals;

public class Item {
	private int id;
    private String description;

    public Item(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
		this.description = description;
	}

	@Override
    public String toString() {
        return "| Item ID: " + id + " | Description: " + description + " |";
    }
}
