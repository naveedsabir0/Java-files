public class MineLayer extends Aircraft
{
	private int mines;

    /**
     * Constructor for objects of class MineLayer
     */
    public MineLayer()
    {
        super();
        mines = 10;
    }

    /**
     * Create a TorpedoPlane making sure that altitude, speed 
     * and nbrTorps are kept >= 0
     * 
     * @param altitude
     * @param speed
     * @param mines
     */
    public MineLayer(int altitude, int speed, int mines) 
    {
        super(altitude, speed);
        setmines(mines);
    }

    /**
     * @return number of mines on board
     */
    public int getMines(){
        return mines;
    }

    /**
     * Set the number of torpedos onboard ignore if
     * the actual parameter is <0
     * @param mines number of mines
     */
    public void setmines(int mines)
    {
        if(mines >= 0){
            this.mines = mines;
        }
    }

    /**
     * Drop a torpedo
     */
    public void deployMines()
    {
        int MinesToDep = (int) (Math.random() * 40 + 10);
        if(MinesToDep >mines){
            MinesToDep = mines;
        }
        if(MinesToDep > 0){
            System.out.print("Minelayer is deploying  mines: ");
                System.out.println(" ==> ooooooooooooooooooooooooooooooooooooooooo ");
                mines--;
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
        s = "Minelayer   ";
        s+= "[speed " + speed + " mph at altitude ";
        s += altitude + " ft] ";
        s += "has " + mines + " mines left";
        return s;
    }
		
	}