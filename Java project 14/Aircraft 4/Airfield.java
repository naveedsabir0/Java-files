import java.util.ArrayList;

/**
 * This class represents an Airfield in a World War 2 air warfare game.
 * 
 * Although the Fighter, Bomber and TorpedoPlane classes all inherit from
 * Aircraft. In this class we use polymorphism so that we only need one
 * ArrayList of Aircraft.
 * 
 * 
 * @author Abdul Razak
 * @version 1.0
 */
public class Airfield
{
    private ArrayList<Aircraft> planes;

    /**
     * Constructor for objects of class Airfield
     */
    public Airfield()
    {
        planes = new ArrayList<Aircraft>();
    }

    /**
     * Print a list of all aircraft at this airfield
     */
    public void listAllPlanes()
    {
        System.out.println("### Aircraft at this airfield ###");
        for(Aircraft a : planes){
            System.out.println(a);
        }
        System.out.println("#############################");
    }

    /**
     * This will add any type of plane of type Aircraft or any that
     * inherit from Aircraft i.e. Fighter, Bomber or TorpedoPlane
     */
    public void addPlane(Aircraft a)
    {
        planes.add(a);
    }

    /**
     * Any plane flying above 120 feet and more than 100mph should
     * use their weapons.
     */
    public void planesToAttack()
    {
        System.out.println("### Aircraft attacking ###");
        for(Aircraft a : planes){
            a.useWeapons();
        }
        System.out.println("#############################");
    }

}
