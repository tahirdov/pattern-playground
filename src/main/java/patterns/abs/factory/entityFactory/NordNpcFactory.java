package patterns.abs.factory.entityFactory;

import patterns.abs.factory.entityTypeFactory.farmer.Farmer;
import patterns.abs.factory.entityTypeFactory.farmer.NordFarmer;
import patterns.abs.factory.entityTypeFactory.warrior.NordWarrior;
import patterns.abs.factory.entityTypeFactory.warrior.Warrior;


public class NordNpcFactory implements NpcFactory{

    @Override
    public Warrior createWarrior() {
        return new NordWarrior();
    }

    @Override
    public Farmer createFarmer() {
        return new NordFarmer();
    }
}
