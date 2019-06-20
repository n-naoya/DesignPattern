public class S9000Stub implements SwitchIF {

    private boolean status = false;

    @Override
    public boolean isOn() {
        return status;
    }

    void setStatus(boolean status) {
        this.status = status;
    }
}
