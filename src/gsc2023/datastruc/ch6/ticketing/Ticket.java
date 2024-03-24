package gsc2023.datastruc.ch6.ticketing;

public class Ticket {
	private int id;
    private String label;
    private String status;

    public Ticket(int id, String label, String status) {
        this.id = id;
        this.label = label;
        this.status = status;
    }
    
    public Ticket(int id) {
    	this.id = id;
    }
    		
    public int getid() {
        return id;
    }

    public String getLabel() {
        return label;
    }
    
    public String getStatus() {
        return status;
    }

    public void setLabel(String label) {
		this.label = label;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
    public String toString() {
		// return "| Ticket " + id + " | " + label + " | ";
        return "| Ticket " + id + " | " + label + " | " + status + " | ";
    }
}
