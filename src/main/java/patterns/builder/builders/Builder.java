package patterns.builder.builders;

public interface Builder {

    void reset();
    void setName(String name);
    void setHP(int HP);
    void setMP(int MP);
    void setSTR(int STR);
    void setIsHumanoid(boolean isHumanoid);
    void setIsHostile(boolean isHostile);
}
