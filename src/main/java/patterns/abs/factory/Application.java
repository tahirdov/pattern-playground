package patterns.abs.factory;

import patterns.abs.factory.entityFactory.NpcFactory;

public class Application {

    private NpcFactory npcFactory;

    public Application (NpcFactory factory) {
        this.npcFactory = factory;
    }

    public void createWarrior(){
        this.npcFactory.createWarrior().create();
    }

    public void createFarmer(){
        this.npcFactory.createFarmer().create();
    }
}
