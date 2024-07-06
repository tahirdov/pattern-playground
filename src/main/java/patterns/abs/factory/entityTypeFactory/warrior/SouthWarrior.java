package patterns.abs.factory.entityTypeFactory.warrior;

import utils.Console;

public class SouthWarrior implements Warrior {
    @Override
    public void create() {
        Console.print("I am a Southern Warrior");
    }
}
