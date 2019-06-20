class Bulb9000Factory extends BulbFactory {
    @Override
    BulbIF factoryMethod() {
        return new B9000Ex();
    }
}
