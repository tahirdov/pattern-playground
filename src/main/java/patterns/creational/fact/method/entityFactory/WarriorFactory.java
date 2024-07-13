package patterns.creational.fact.method.entityFactory;

import patterns.creational.fact.method.entity.NPC;
import patterns.creational.fact.method.entity.Warrior;

public class WarriorFactory extends NpcFactory{

    @Override
    NPC createNpc() {
        return new Warrior();
    }
}
