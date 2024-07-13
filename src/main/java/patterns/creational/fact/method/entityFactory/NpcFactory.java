package patterns.creational.fact.method.entityFactory;

import patterns.creational.fact.method.entity.NPC;

public abstract class NpcFactory {

    abstract NPC createNpc();

    public void printNpcSpecialty(){
        NPC npc = createNpc();
        npc.create();
        npc.printSpecialty();
    }
}
