package patterns.creational.builder.builders;

import patterns.creational.builder.entity.NPC;

public class NpcBuilder implements Builder{

    private NPC npc;

    public NpcBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.npc = new NPC();
    }

    @Override
    public void setName(String name) {
        this.npc.setName(name);
    }

    @Override
    public void setHP(int HP) {
        this.npc.setHP(HP);
    }

    @Override
    public void setMP(int MP) {
        this.npc.setMP(MP);
    }

    @Override
    public void setSTR(int STR) {
        this.npc.setSTR(STR);
    }

    @Override
    public void setIsHumanoid(boolean isHumanoid) {
        this.npc.setHumanoid(isHumanoid);
    }

    @Override
    public void setIsHostile(boolean isHostile) {
        this.npc.setHostile(isHostile);
    }

    public NPC getNpc() {
        NPC npc = this.npc;
        this.reset();
        return npc;
    }
}
