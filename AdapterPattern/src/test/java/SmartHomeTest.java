import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SmartHomeTest {

    private SmartHome smartHome;
    private S9000Stub s;
    private B9000Spy b;

    @Before
    public void setup() {
        s = new S9000Stub();
        b = new B9000Spy();
        smartHome = new SmartHome(s, b);
    }

    @Test
    public void off_test() {
        s.setStatus(false);
        smartHome.run();


        assertTrue(b.turnOffWasCalled);
    }

    @Test
    public void on_test() {
        s.setStatus(true);
        smartHome.run();


        assertTrue(b.turnOnWasCalled);
    }
}
