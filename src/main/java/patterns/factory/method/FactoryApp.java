package patterns.factory.method;


import patterns.factory.method.entityFactory.FarmerFactory;
import patterns.factory.method.entityFactory.NpcFactory;
import patterns.factory.method.entityFactory.WarriorFactory;

@SuppressWarnings("all")
public class FactoryApp {

    private NpcFactory npcFactory;

    public void initialize() {
        String npcType = "ajkskdhbashkdb";

        if (npcType.equals("warrior")) {
            npcFactory = new WarriorFactory();
            npcFactory.printNpcSpecialty();
        } else if (npcType.equals("farmer")) {
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
