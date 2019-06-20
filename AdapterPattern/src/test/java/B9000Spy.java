public class B9000Spy implements BulbIF {

    boolean turnOnWasCalled = false;
    boolean turnOffWasCalled = false;

    @Override
    public void turnOn() {
        turnOnWasCalled = true;
    }

    @Override
    public void turnOff() {
        turnOffWasCalled = true;
    }
}
