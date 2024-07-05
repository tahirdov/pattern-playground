package patterns.factory.method.entityFactory;

import patterns.factory.method.entity.NPC;
import patterns.factory.method.entity.Warrior;

public class WarriorFactory extends NpcFactory{

    @Override
    NPC createNpc() {
        return new Warrior();
    }
}
