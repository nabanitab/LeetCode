public final class Immutableclass {

    private final String name;

    public Immutableclass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Immutableclass{" +
                "name='" + name + '\'' +
                '}';
    }
}
