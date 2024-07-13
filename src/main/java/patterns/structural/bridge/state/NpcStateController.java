package patterns.structural.bridge.state;

import patterns.structural.bridge.npc.NPC;
import utils.Console;

public class NpcStateController {

    protected NPC npc;

    public NpcStateController(NPC npc){
        this.npc = npc;
    }

    public void changeAttackState(){
        if (npc.isAttacking()) npc.stopAttacking();
        else npc.startAttacking();
        Console.print("Starting attacking players");
    }

    public void changeAggressiveness() {
        if (npc.isAggressive()) npc.getCalm();
        else npc.getAggressive();
        Console.print("Got aggressive");
    }


}
