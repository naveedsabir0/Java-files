/**
 * 
 * @author Naveed SABIR
 * Submission date: 27/10/2023
 * Module: Data Structures and Algorithms SWE5202
 * PORTFOLIO ITEM 1
 */



import java.util.Comparator;

public class Appointment  implements Cloneable, Comparable<Appointment>, Comparator<Appointment>{
    private String name;
    private String purpose;
    private Date date;
    private Time time;
    private MeetingRoom room;

    /**
     * Parameterised constructor
     * @param name
     * @param purpose
     * @param date
     * @param time
     * @param room
     */
    public Appointment(String name, String purpose, Date date, Time time, MeetingRoom room) {
        this.name = name;
        this.purpose = purpose;
        this.date = date;
        this.time = time;
        this.room = room;
    }
    
    /**
     * Default constructor initialises attributes to sensible values
     */
    public Appointment() {
        this.name = "";
        this.purpose = "";
        this.date = new Date();
        this.time = new Time();
        this.room = new MeetingRoom();
    }
    
    /**
     * Copy constructor for shallow copying
     * @param other
     */
    public Appointment(Appointment other) {
        // Copy constructor for shallow copying
        this.name = other.name;
        this.purpose = other.purpose;
        this.date = other.date;
        this.time = other.time;
        this.room = other.room;
    }

    /**
     * Getter and setter methods for name, purpose, date, time, and room
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter method
     * @param purpose
     */
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    /**
     * Setter Method
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Setter method
     * @param time
     */
    public void setTime(Time time) {
        this.time = time;
    }

    /**
     * Setter method
     * @param room
     */
    public void setRoom(MeetingRoom room) {
        this.room = room;
    }

    /**
     * Getter Method
     * @return getName()
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method
     * @return getPurpose()
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Getter Method
     * @return getDate()
     */
    public Date getDate() {
        return date;
    }

    /**
     * Getter Method
     * @return time
     */
    public Time getTime() {
        return time;
    }

    /**
     * getter Method
     * @return getRoom()
     */
    public MeetingRoom getRoom() {
        return room;
    }
    
    /**
     * Print value stored in memory 
     *@return return "Name: " + name + "\nPurpose: " + purpose + "\nDate: " + date + "\nTime: " + time + "\nRoom: " + room;
     */
    @Override
    public String toString() {
        return "Name: " + name + "\nPurpose: " + purpose + "\nDate: " + date + "\nTime: " + time + "\nRoom: " + room;
    }
    
    /**
     * clone() method
     */
    public Appointment clone() {
        try {
            Appointment cloned = (Appointment) super.clone();
            // Perform deep copying of the Date, Time, and MeetingRoom objects
            cloned.date = this.date.clone();
            cloned.time = this.time.clone();
            cloned.room = this.room.clone();
            //cloned.hashCode = this.hashCode.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // This should not happen.
        }
        
    }
    
 
    
    /**
     * compareTo method
     * Compares so chronological sorting can later happen
     */
    @Override
    public int compareTo(Appointment other) {
        int dateComparison = this.date.compareTo(other.date);
        if (dateComparison != 0) {
            return dateComparison;
        } else {
            int timeComparison = this.time.compareTo(other.time);
            if (timeComparison != 0) {
                return timeComparison;
            } else {
                return this.room.compareTo(other.room); //Added as a backup option
            }
        }
    }

    
    /**
     * Assuming the room format is "Xn-XX" where X is a letter and n is a number
     * Convert the room floors to integers for comparison
     * Compare the floor numbers and return the result
     * 
     * the choice of starting the substring at index 1 is determined by the specific structure of the room names and the need
     * to isolate and extract the relevant floor information while excluding any other characters that may precede it in the
     * room name format.
     */
    @Override
    public int compare(Appointment appointment1, Appointment appointment2) {
        String room1Floor = appointment1.getRoom().getRoom().substring(1, 2);
        String room2Floor = appointment2.getRoom().getRoom().substring(1, 2);

        int floor1 = Integer.parseInt(room1Floor);
        int floor2 = Integer.parseInt(room2Floor);

        return Integer.compare(floor1, floor2);
    }

}
