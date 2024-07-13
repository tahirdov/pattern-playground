package patterns.creational.abs.factory.entityFactory;

import patterns.creational.abs.factory.entityTypeFactory.farmer.NordFarmer;
import patterns.creational.abs.factory.entityTypeFactory.farmer.Farmer;
import patterns.creational.abs.factory.entityTypeFactory.warrior.NordWarrior;
import patterns.creational.abs.factory.entityTypeFactory.warrior.Warrior;


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
