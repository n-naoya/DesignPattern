class SmartHome {

    private SwitchIF s;
    private BulbIF b;

    SmartHome(SwitchIF s, BulbIF b) {
        this.s = s;
        this.b = b;
    }

    void run() {
        if (s.isOn()) {
            b.turnOn();
        } else {
            b.turnOff();
        }
    }
}
