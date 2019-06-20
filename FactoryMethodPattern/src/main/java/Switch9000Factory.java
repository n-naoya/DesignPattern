class Switch9000Factory extends SwitchFactory {

    @Override
    SwitchIF factoryMethod() {
        return new S9000Ex();
    }
}
