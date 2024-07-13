package patterns.creational.prototype;

import patterns.creational.prototype.entity.Mage;
import patterns.creational.prototype.entity.NPC;
import patterns.creational.prototype.entity.Warrior;

import java.util.ArrayList;
import java.util.List;

public class Application {

    private final List<NPC> npcList = new ArrayList<>();
    private final List<NPC> cloneList = new ArrayList<>();

    public void initialize() {
        Warrior warrior  = new Warrior();

        Warrior cloneWarrior = (Warrior) warrior.clone();
        cloneWarrior.setName("Clone Warrior");
        cloneList.add(cloneWarrior);
        warrior.setName("Warrior");
        npcList.add(warrior);

        Mage mage = new Mage();
        Mage cloneMage = (Mage) mage.clone();
        cloneMage.setName("Clone Mage");
        cloneList.add(cloneMage);
        mage.setName("Mage");
        npcList.add(mage);

        System.out.println("NPC List: " + npcList);
        System.out.println("Clone List: " + cloneList);
    }

}
