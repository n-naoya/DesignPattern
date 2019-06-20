public class Main {
    public static void main(String[] args) {
        SmartHome smartHome = new SmartHome(new S9000Ex(), new B9000Ex());
        smartHome.run();
    }
}
