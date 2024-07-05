package patterns.factory.method.entity;

public class Farmer implements NPC {
    @Override
    public void create() {
        System.out.println("A farmer NPC was created");
    }

    @Override
    public void printSpecialty() {
        System.out.println("Farmer is growing crops");
    }
}
