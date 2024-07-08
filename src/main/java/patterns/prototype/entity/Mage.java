package patterns.prototype.entity;

public class Mage extends NPC{

    private String type;
    private int MP;
    private int INT;

    public Mage() {}

    public void setType(String type) {
        this.type = type;
    }

    public Mage(Mage source) {
        super(source);
        this.MP = source.MP;
        this.INT = source.INT;
        this.type = super.getName();
    }

    @Override
    public NPC clone() {
        return new Mage(this);
    }
}
