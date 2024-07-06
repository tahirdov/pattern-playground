package patterns.abs.factory.entityFactory;

import patterns.abs.factory.entityTypeFactory.farmer.Farmer;
import patterns.abs.factory.entityTypeFactory.warrior.Warrior;

public interface NpcFactory {

    Warrior createWarrior();
    Farmer createFarmer();
}
