package patterns.structural.bridge;

import patterns.structural.bridge.npc.NPC;
import patterns.structural.bridge.npc.Warrior;
import patterns.structural.bridge.state.AdvancedNpcStateController;
import patterns.structural.bridge.state.NpcStateController;
import utils.Console;

public class Application {

    public void init() {

        NPC npc = new Warrior(100, false, false);
        NpcStateController stateController = new NpcStateController(npc);
        Console.print("State Controller used:");
        stateController.changeAttackState();
        stateController.changeAggressiveness();
        npc.loseHp(1000);
        Console.print("Advanced Controller used");
        AdvancedNpcStateController advancedController = new AdvancedNpcStateController(npc);
        advancedController.leaveCombat();

    }
}
