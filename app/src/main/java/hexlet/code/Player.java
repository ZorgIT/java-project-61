package hexlet.code;

public final class Player {
    private String name;

    Player(String nameInit) {
        this.name = nameInit;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}
