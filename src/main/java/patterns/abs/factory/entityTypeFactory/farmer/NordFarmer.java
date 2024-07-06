package patterns.abs.factory.entityTypeFactory.farmer;

import utils.Console;

public class NordFarmer implements Farmer {
    @Override
    public void create() {
        Console.print("I am a nord farmer");
    }
}
