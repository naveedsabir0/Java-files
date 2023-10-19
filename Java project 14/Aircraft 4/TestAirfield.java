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
        /*
         * We are seeding the random number generator with the number 1
         * to ensure that we get some planes of each type.
         * This would be changed to Random() in the final game.
         */
        rnd = new Random(1);
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
        // Create an instance of TestAirfield
        TestAirfield test = new TestAirfield();

        // Call the test method
        test.test_001();
    }
    
    private void addPlanes_A(Airfield af, int nbrPlanes)
    {
        int type;
        Aircraft a;
        for(int i = 0; i < nbrPlanes; i++){
            type = rnd.nextInt(3);
            if(type == 0){
                a = new Fighter(rnd.nextInt(100)+80, rnd.nextInt(80)+200, rnd.nextInt(200) + 300);
                af.addPlane(a);
            }
            else if(type == 1) {
                a = new Bomber(rnd.nextInt(100)+80, rnd.nextInt(80)+200, rnd.nextInt(20) + 40);
                af.addPlane(a);

            }
            else if(type == 2){
                a = new TorpedoPlane(rnd.nextInt(100)+80, rnd.nextInt(80)+200, rnd.nextInt(4));
                af.addPlane(a);

            }
            else {
                a = new MineLayer(rnd.nextInt(1)+1, rnd.nextInt(24)+1, rnd.nextInt(10));
                af.addPlane(a);
        }
    }
    }
}
