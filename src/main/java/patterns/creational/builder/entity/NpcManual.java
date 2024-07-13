package patterns.creational.builder.entity;

@SuppressWarnings("all")
public class NpcManual {
    private String name;
    private String HP;
    private String MP;
    private String STR;
    private String isHostile;
    private String isHumanoid;

    public void setHP(int HP) {
        this.HP = String.format("NPC HP is: %s.", HP);
    }

    public void setIsHostile(boolean isHostile) {
        this.isHostile = String.format("It is a %s NPC.", isHostile ? "hostile" : "non-hostile");
    }

    public void setIsHumanoid(boolean isHumanoid) {
        this.isHumanoid = String.format("It is%s a humanoid.", isHumanoid ? "" : " not");
    }

    public void setMP(int MP) {
        this.MP = String.format("NPC MP is: %s.", MP);
    }

    public void setName(String name) {
        this.name = String.format("NPC name is %s.", name);
    }

    public void setSTR(int STR) {
        this.STR = String.format("NPC strength is %s. It means it is%s a strong NPC", STR, (STR >= 20) ? "" : " not");
    }

    @Override
    public String toString() {
        return String.format("Detailed info: \n" +
                                "%s %s %s \n" +
                                "%s %s \n" +
                                "%s",
                                name, isHostile, isHumanoid, HP, MP, STR);
    }
}
