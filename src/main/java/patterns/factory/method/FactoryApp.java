package patterns.factory.method;


import patterns.factory.method.entityFactory.FarmerFactory;
import patterns.factory.method.entityFactory.NpcFactory;
import patterns.factory.method.entityFactory.WarriorFactory;
import utils.Console;

@SuppressWarnings("all")
public class FactoryApp {

    private NpcFactory npcFactory;

    public void initialize() {
        String npcType = Console.input().next();

        if (npcType.equalsIgnoreCase("warrior")) {
            npcFactory = new WarriorFactory();
            npcFactory.printNpcSpecialty();
        } else if (npcType.equalsIgnoreCase("farmer")) {
            npcFactory = new FarmerFactory();
            npcFactory.printNpcSpecialty();
        } else System.out.println("Invalid npc type");
    }

    public void main() {
        initialize();
    }
    public static void main(String[] args) {
        new FactoryApp().main();
    }

}
