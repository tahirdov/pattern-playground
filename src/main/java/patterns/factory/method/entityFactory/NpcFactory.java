package patterns.factory.method.entityFactory;

import patterns.factory.method.entity.NPC;

public abstract class NpcFactory {

    abstract NPC createNpc();

    public void printNpcSpecialty(){
        NPC npc = createNpc();
        npc.create();
        npc.printSpecialty();
    }
}
