package patterns.builder.entity;

public class NPC {
    private String name;
    private int HP;
    private int MP;
    private int STR;
    private boolean isHostile;
    private boolean isHumanoid;

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setHostile(boolean hostile) {
        isHostile = hostile;
    }

    public void setHumanoid(boolean humanoid) {
        isHumanoid = humanoid;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSTR(int STR) {
        this.STR = STR;
    }

    @Override
    public String toString() {
        return String.format("NPC was created:\n Name: %s, HP: %d, MP: %d, STR: %d, Hostility: %s, Humanoid: %s \n",
                                name, HP, MP, STR, isHostile, isHumanoid);
    }
}
