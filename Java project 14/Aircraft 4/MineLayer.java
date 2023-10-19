
public class MineLayer extends Aircraft{
	

/**
 * Write a description of class TorpedoPlane here.
 * 
 * @author Abdul Razak
 * @version 1
 */
  private int Mines;

    /**
     * Constructor for objects of class TorpedoPlane
     */
    public MineLayer()
    {
        super();
        Mines = 10;
    }

    
    /**
    * Making use of polymorphism.
    */
    public void useWeapons()
    {
     deployMines();
    }

    /**
     * Create a TorpedoPlane making sure that altitude, speed 
     * and nbrTorps are kept >= 0
     * 
     * @param altitude
     * @param speed
     * @param nbrTorps
     */
    public MineLayer(int altitude, int speed, int nbrTorps) 
    {
        super(altitude, speed);
        setNbrTorps(Mines);
    }

    /**
     * @return number of torpedos onboard
     */
    public int getNbrTorps(){
        return Mines;
    }

    /**
     * Set the number of torpedos onboard ignore if
     * the actual parameter is <0
     * @param nbrTorps number of torpedos
     */
    public void setNbrTorps(int nbrTorps)
    {
        if(nbrTorps >= 0){
            this.Mines = nbrTorps;
        }
    }

    /**
     * Drop a torpedo
     */
    public void deployMines()
    {
        int nbrToDrop = (int) (Math.random() * 20 + 20);
        if(nbrToDrop >Mines){
            nbrToDrop = Mines;
        }
        if(nbrToDrop > 0){
            System.out.print("MineLayer is shooting a mine ");
                System.out.println(" ==> ");
                Mines--;
        }
        else {
            System.out.println("MineLayer has no more mines");
        }
    }

    /**
     * Get description of a MineLayer
     */
    public String toString()
    {
        String s;
        s = "TorpedoPlane   ";
        s+= "[speed " + speed + " mph at altitude ";
        s += altitude + " ft] ";
        s += "has " + Mines + " torpedoes left";
        return s;
    }

}

