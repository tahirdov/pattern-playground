package patterns.abs.factory;


import patterns.abs.factory.entityFactory.NordNpcFactory;
import patterns.abs.factory.entityFactory.NpcFactory;
import patterns.abs.factory.entityFactory.SouthNpcFactory;
import utils.Console;

@SuppressWarnings("all")
public class AbstractFactoryApp {

    public static void main(String[] args) {
        String type = Console.input().next();
        NpcFactory factory;

        if (type.equalsIgnoreCase("nord")) {
            factory = new NordNpcFactory();
        } else if (type.equalsIgnoreCase("south")) {
            factory = new SouthNpcFactory();
        } else throw new RuntimeException("Invalid type: " + type);

        Application app = new Application(factory);
        app.createFarmer();
        app.createWarrior();
    }
}
