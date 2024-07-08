package patterns.prototype.entity;

public abstract class NPC {

    private String name;
    private boolean isHumanoid;

    public NPC() {}

    public NPC (NPC source) {
        this.name = source.name;
        this.isHumanoid = source.isHumanoid;
    }

    public abstract NPC clone();

    @Override
    public String toString() {
        return String.format("[NPC name: %s, is%s a humanoid]", name, isHumanoid ? "":" not");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
