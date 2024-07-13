package patterns.structural.bridge.state;

import patterns.structural.bridge.npc.NPC;
import utils.Console;

public class AdvancedNpcStateController extends NpcStateController {


    public AdvancedNpcStateController(NPC npc) {
        super(npc);
    }

    public void leaveCombat() {
        if (npc.isThePlayerDead() || !npc.wasHitInLastTenSeconds()) {
            npc.stopAttacking();
            npc.getCalm();
            Console.print("You have been leaving combat.");
        }
        else Console.print("You are still in combat.");
    }
}
