import java.util.Random;

class S9000 {
    public boolean isOn() {
        return randomBoolean();
    }

    private boolean randomBoolean() {
        Random random = new Random();
        int randomValue = random.nextInt(2);
        return randomValue % 2 != 0;
    }
}
