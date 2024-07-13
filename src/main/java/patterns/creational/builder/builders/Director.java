package patterns.creational.builder.builders;

public class Director {

    public void constructHumanoidMageNpc(Builder builder) {
        builder.reset();
        builder.setName("Mage");
        builder.setHP(100);
        builder.setMP(300);
        builder.setSTR(10);
        builder.setIsHostile(false);
        builder.setIsHumanoid(true);
    }

    public void constructCrocodileNpc(Builder builder) {
        builder.reset();
        builder.setName("Crocodile");
        builder.setHP(200);
        builder.setMP(20);
        builder.setSTR(40);
        builder.setIsHostile(true);
        builder.setIsHumanoid(false);
    }
}
