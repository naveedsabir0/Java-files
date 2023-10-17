public class testclass {
    public static void main(String[] args) {
        // Create Fighter object
        Fighter fighter = new Fighter(40000, 1500, 6);

        // Create Bomber object
        Bomber bomber = new Bomber(35000, 800, 10);

        // Create TorpedoPlane object
        TorpedoPlane torpedoPlane = new TorpedoPlane(3000, 2000, 30);

        System.out.println("Initial State:");
        System.out.println(fighter);
        System.out.println(bomber);
        System.out.println(torpedoPlane);

        // Test dropTorp method for TorpedoPlane
        torpedoPlane.dropTorps();
        torpedoPlane.dropTorps();
        torpedoPlane.dropTorps();
        torpedoPlane.dropTorps(); // Try to drop more torpedoes than available

        // Test fireGuns method for TorpedoPlane
        torpedoPlane.dropTorps();
        torpedoPlane.dropTorps();
        torpedoPlane.dropTorps();

        // Update altitude of Fighter and Bomber
        fighter.setAltitude(45000);
        bomber.setAltitude(40000);

        System.out.println("\nUpdated State:");
        System.out.println(fighter);
        System.out.println(bomber);
        System.out.println(torpedoPlane);
    }
}
