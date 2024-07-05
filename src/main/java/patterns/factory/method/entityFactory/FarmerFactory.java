package patterns.factory.method.entityFactory;

import patterns.factory.method.entity.Farmer;
import patterns.factory.method.entity.NPC;

public class FarmerFactory extends NpcFactory{

    @Override
    NPC createNpc() {
        return new Farmer();
    }
}
