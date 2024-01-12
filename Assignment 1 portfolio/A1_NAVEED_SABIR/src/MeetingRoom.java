/**
 * 
 * @author Naveed SABIR
 * Submission date: 27/10/2023
 * Module: Data Structures and Algorithms SWE5202
 * PORTFOLIO ITEM 1
 */



public class MeetingRoom implements Cloneable, Comparable<MeetingRoom>{
    private String room;

    public MeetingRoom(String room) {
        this.room = room;
    }

    /**
     * Default constructor initialises to an empty room name
     */
    public MeetingRoom() {
        this.room = "";
    }
    
    /**
     * Copy constructor for shallow copying
     * @param other
     */
    public MeetingRoom(MeetingRoom other) {
        // Copy constructor for shallow copying
        this.room = other.room;
    }
    
    
    /**
     * setter method for room
     * @param room
     */
    public void setRoom(String room) {
        this.room = room;
    }

    /**
     * Getter method
     * @return room
     */
    public String getRoom() {
        return room;
    }
    
    /**
     * @return (MeetingRoom)
     * Clone() method
     */
    @Override
    public MeetingRoom clone() {
        try {
            return (MeetingRoom) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // This should not happen.
        }
    }
    
    /**
     * @return room
     * returns the value stored in memory
     */
    @Override
    public String toString() {
        return room;
    }
    
    /**
     * CompareTo for comparison value
     * @return room.compareTo(other.room)
     */
    @Override
    public int compareTo(MeetingRoom other) {
        return room.compareTo(other.room);
    }
}
