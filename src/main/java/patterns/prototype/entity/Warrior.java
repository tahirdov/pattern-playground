package patterns.prototype.entity;

public class Warrior extends NPC{

    private String type;
    private int HP;
    private int STR;

    public Warrior() {}

    public Warrior(Warrior source) {
        super(source);
        this.HP = source.HP;
        this.STR = source.STR;
        this.type = super.getName();
    }

    @Override
    public NPC clone() {
        return new Warrior(this) ;
    }

    public void setType(String type) {
        this.type = type;
    }
}
