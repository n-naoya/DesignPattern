public class Main {
    public static void main(String[] args) {
        SwitchFactory switchFactory = new Switch9000Factory();
        BulbFactory bulbFactory = new Bulb9000Factory();

        SwitchIF s = switchFactory.factoryMethod();
        BulbIF b = bulbFactory.factoryMethod();
        SmartHome smartHome = new SmartHome(s, b);
        smartHome.run();
    }
}
