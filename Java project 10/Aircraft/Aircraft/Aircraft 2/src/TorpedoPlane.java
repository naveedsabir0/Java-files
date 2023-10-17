

public class TorpedoPlane extends Aircraft
{

	private int nbrTorps;
	
	public TorpedoPlane()
	{
		super();
		nbrTorps = 100;
	}
	
	public TorpedoPlane(int altitude,int speed, int nbrTorps)
	{
		super(altitude, speed);
		setNbrTorps(nbrTorps);
	}
	
	public int getNbrTorps(){
        return nbrTorps;
    }
	
	public void setNbrTorps(int nbrTorps)
    {
        if(nbrTorps >= 0){
            this.nbrTorps = nbrTorps;
        }
    }
	
	
	public void dropTorps()
	{
		int nbrFired = (int) (Math.random() + 1);
		if(nbrFired >nbrTorps){
			nbrFired = nbrTorps;
		}
		if(nbrFired > 0){
			System.out.print("Torpedo is shooting");
			for(int i = 0; i < nbrFired; i++){
				if(i % 4 == 0){
					System.out.print(":");
				}
				nbrTorps--;
			}
			System.out.println();
		}
		else {System.out.println("Torpedo is out of ammo");
		}
			
		}
		
		public String toString()
		{
			String s;
			s = "Torpedo  ";
			s+= "[speed " + speed + " mph at altitude ";
			s += altitude + " ft] ";
			s += "has " + nbrTorps + " bullets left";
			return s;
		
		}
}
