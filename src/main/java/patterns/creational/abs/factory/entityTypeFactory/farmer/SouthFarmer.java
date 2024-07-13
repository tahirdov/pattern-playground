package patterns.creational.abs.factory.entityTypeFactory.farmer;

import utils.Console;

public class SouthFarmer implements Farmer {
    @Override
    public void create() {
        Console.print("I am a Southern Farmer");
    }
}
