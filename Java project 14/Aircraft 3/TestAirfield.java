import java.util.Random;

/**
 * The TestAirfield class is used to test the AirField class
 * 
 * @author Abdul Razak
 * @version 1.0
 */
public class TestAirfield
{
    // instance variables - replace the example below with your own
    private Random rnd;

    /**
     * Constructor for objects of class TestAirfield
     */
    public TestAirfield()
    {
        rnd = new Random();
    }

    public void test_001()
    {
        Airfield af = new Airfield();
        addPlanes_A(af, 10);
        af.listAllPlanes();
        af.planesToAttack();
        af.listAllPlanes();        
    }
    
    public static void main(String[] args) {
        //call the test_001() to see results by adding an instance
        TestAirfield test = new TestAirfield();
        test.test_001();
    }
  

    private void addPlanes_A(Airfield af, int nbrPlanes)
    {
        int type;
        Fighter f;
        Bomber b;
        TorpedoPlane t;
        MineLayer m;
        for(int i = 0; i < nbrPlanes; i++){
            type = rnd.nextInt(4);
            if(type == 0){
                f = new Fighter(rnd.nextInt(100)+80, rnd.nextInt(80)+200, rnd.nextInt(200) + 300);
                af.addFighter(f);
            }
            else if(type == 1) {
                b = new Bomber(rnd.nextInt(100)+80, rnd.nextInt(80)+200, rnd.nextInt(20) + 40);
                af.addBomber(b);

            }
            else if(type == 2) {
                t = new TorpedoPlane(rnd.nextInt(100)+80, rnd.nextInt(80)+200, rnd.nextInt(4));
                af.addTorpedoPlane(t);
            }
            else {
            	m = new MineLayer(rnd.nextInt(1)+1, rnd.nextInt(23)+1, rnd.nextInt(25));
            	af.addMineLayer(m);
            }
        }
    }

}
