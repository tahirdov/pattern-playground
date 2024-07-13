package patterns.creational.abs.factory.entityFactory;

import patterns.creational.abs.factory.entityTypeFactory.farmer.Farmer;
import patterns.creational.abs.factory.entityTypeFactory.warrior.Warrior;

public interface NpcFactory {

    Warrior createWarrior();
    Farmer createFarmer();
}
