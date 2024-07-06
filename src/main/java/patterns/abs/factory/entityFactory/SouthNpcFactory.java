package patterns.abs.factory.entityFactory;

import patterns.abs.factory.entityTypeFactory.farmer.Farmer;
import patterns.abs.factory.entityTypeFactory.farmer.SouthFarmer;
import patterns.abs.factory.entityTypeFactory.warrior.SouthWarrior;
import patterns.abs.factory.entityTypeFactory.warrior.Warrior;

public class SouthNpcFactory implements NpcFactory {
    @Override
    public Farmer createFarmer() {
        return new SouthFarmer();
    }

    @Override
    public Warrior createWarrior() {
        return new SouthWarrior();
    }
}
