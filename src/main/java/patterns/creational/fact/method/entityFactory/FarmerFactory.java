package patterns.creational.fact.method.entityFactory;

import patterns.creational.fact.method.entity.Farmer;
import patterns.creational.fact.method.entity.NPC;

public class FarmerFactory extends NpcFactory{

    @Override
    NPC createNpc() {
        return new Farmer();
    }
}
