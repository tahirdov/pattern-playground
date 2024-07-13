package patterns.structural.entity;

public interface NPC {

    int distanceFromPlayer();
    boolean wasHitInLastTenSeconds();
    boolean isThePlayerDead();
    boolean isAggressive();
    boolean isAttacking();
    void startAttacking();
    void stopAttacking();
    void getAggressive();
    void getCalm();

}
