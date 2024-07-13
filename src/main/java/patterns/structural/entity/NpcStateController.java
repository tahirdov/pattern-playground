package patterns.structural.entity;

public abstract class NpcStateController {

    protected NPC npc;

    public NpcStateController(NPC npc){
        this.npc = npc;
    }

    public void changeAttackState(){
        if (npc.isAttacking()) npc.stopAttacking();
        else npc.startAttacking();
    }

    public void changeAggressiveness() {
        if (npc.isAggressive()) npc.getCalm();
        else npc.getAggressive();
    }


}
