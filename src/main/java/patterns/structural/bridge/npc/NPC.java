package patterns.structural.bridge.npc;

public interface NPC {
    boolean wasHitInLastTenSeconds();
    boolean isThePlayerDead();
    boolean isAggressive();
    boolean isAttacking();
    void startAttacking();
    void stopAttacking();
    void getAggressive();
    void getCalm();
    void loseHp(int damage);
}
