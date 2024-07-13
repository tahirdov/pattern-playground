package patterns.structural.entity;

public class AdvancedNpcStateController extends NpcStateController {


    public AdvancedNpcStateController(NPC npc) {
        super(npc);
    }

    public void leaveCombat() {
        if (npc.isThePlayerDead() || !npc.wasHitInLastTenSeconds() || npc.distanceFromPlayer() >= 20) {
            npc.stopAttacking();
            npc.getCalm();
        }
    }
}
