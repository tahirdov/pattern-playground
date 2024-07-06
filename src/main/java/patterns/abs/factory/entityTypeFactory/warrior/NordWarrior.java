package patterns.abs.factory.entityTypeFactory.warrior;

import utils.Console;

public class NordWarrior implements Warrior {
    @Override
    public void create() {
        Console.print("I am a nord warrior");
    }
}
