class X9000Factory extends Factory {
    @Override
    SwitchIF getSwitch() {
        return new S9000Ex();
    }

    @Override
    BulbIF getBulb() {
        return new B9000Ex();
    }
}
