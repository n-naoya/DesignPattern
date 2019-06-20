public class Main {
    public static void main(String[] args) {
        Factory factory = new X9000Factory();
        SmartHome smartHome = new SmartHome(factory.getSwitch(), factory.getBulb());
        smartHome.run();
    }
}
