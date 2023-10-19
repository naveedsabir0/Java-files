public class Dog {
    private Long chipID; // A unique number stored on a chip and inserted into the dog
    private String name; // The dog’s name e.g. Fido

    public Dog(Long chipID, String name) {
        this.chipID = chipID;
        this.name = name;
    }

    public Long getChipID() {
        return chipID;
    }

    public void setChipID(Long chipID) {
        this.chipID = chipID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString()
    {
    	String s;
    	s= name + " (" + chipID + ")";
    	return s;
    }
    
    public int compareTo(Dog otherDog) {
        if (this.chipID.equals(otherDog.getChipID())) {
            // If chipIDs are equal, compare based on name
            return this.name.compareTo(otherDog.getName());
        } else {
            // Compare based on chipID
            return this.chipID.compareTo(otherDog.getChipID());
        }
    }


}

