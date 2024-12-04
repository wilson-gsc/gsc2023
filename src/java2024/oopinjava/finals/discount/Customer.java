package java2024.oopinjava.finals.discount;

public class Customer {
    private String name;
    private boolean member;
    private String memberType;

    public Customer(String name) {
        this.name = name;
        this.member = false;
        this.memberType = "";
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String type) {
        this.memberType = type;
    }
    
    public String getMemberStatus() {
		if (member) {
			return "Yes";
		} else {
			return "No";
		}
	}

    @Override
    public String toString() {
    	if(member) {
    		return "Customer { "
            		+ "\n\t     Name: " + name + ","
            		+ "\n\t     Member: " + getMemberStatus() + ","
            		+ "\n\t     Type: " + memberType + "\n\t}";
    	} else {
    		return "Customer { "
            		+ "\n\t     Name: " + name + ","
            		+ "\n\t     Member: " + getMemberStatus() + "\n\t}";
    	}
        
    }
    
    public static void main(String[] args) {
	    // Create a new Customer object
	    Customer customer1 = new Customer("Alice"); 

	    // Print the customer's information (calls toString() implicitly)
	    System.out.println(customer1); 

	    // Update the customer's membership
	    customer1.setMember(true);
	    customer1.setMemberType("Gold");

	    // Print the updated information
	    System.out.println("\n"+customer1); 
	}
}


