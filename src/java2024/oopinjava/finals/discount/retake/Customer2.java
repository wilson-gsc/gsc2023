package java2024.oopinjava.finals.discount.retake;

public class Customer2 {
    private String name;
    private boolean member;
    private String memberType;

    public Customer2(String name) {
        this.name = name;
        this.member = false;
        this.memberType = "";
    }

    public String getName() { return name; }

    public boolean isMember() { return member; }

    public void setMember(boolean member) { this.member = member; }

    public String getMemberType() { return memberType; }

    public void setMemberType(String type) { this.memberType = type; }
    
    public String getMemberStatus() {
		if (member) { return "Yes"; } else { return "No"; }
	}

    @Override
    public String toString() {
    	if(member) {
    		return "Customer { "
            		+ "\n\t     Name: " + name + ","
            		+ "\n\t     Type: " + memberType + "\n\t}";
    	} else {
    		return "Customer { "
            		+ "\n\t     Name: " + name + ","
            		+ "\n\t     Member: " + getMemberStatus() + ","
            		+ "\n\t     Member: " + getMemberStatus() + "\n\t}";
    	}
        
    }
}