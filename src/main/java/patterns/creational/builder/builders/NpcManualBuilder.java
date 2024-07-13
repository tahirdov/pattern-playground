package patterns.creational.builder.builders;

import patterns.creational.builder.entity.NpcManual;

public class NpcManualBuilder implements Builder{

    NpcManual npcManual;

    public NpcManualBuilder() {
        this.reset();
    }
    @Override
    public void reset() {
        npcManual = new NpcManual();
    }

    @Override
    public void setName(String name) {
        npcManual.setName(name);
    }

    @Override
    public void setHP(int HP) {
        npcManual.setHP(HP);
    }

    @Override
    public void setMP(int MP) {
        npcManual.setMP(MP);
    }

    @Override
    public void setSTR(int STR) {
        npcManual.setSTR(STR);
    }

    @Override
    public void setIsHumanoid(boolean isHumanoid) {
        npcManual.setIsHumanoid(isHumanoid);
    }

    @Override
    public void setIsHostile(boolean isHostile) {
        npcManual.setIsHostile(isHostile);
    }

    public NpcManual getNpcManual() {
        NpcManual manual = this.npcManual;
        this.reset();
        return manual;
    }
}
