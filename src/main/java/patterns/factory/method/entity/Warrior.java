package patterns.factory.method.entity;

public class Warrior implements NPC {
    @Override
    public void create() {
        System.out.println("A warrior NPC created");
    }

    @Override
    public void printSpecialty() {
        System.out.println("Warrior is charging ahead");
    }
}
