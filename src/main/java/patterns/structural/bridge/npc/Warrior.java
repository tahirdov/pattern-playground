package patterns.structural.bridge.npc;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;


public class Warrior implements NPC {

    private LocalDateTime lastHitTime;
    private int HP;
    private boolean isAggressive;
    private boolean isAttacking;

    public Warrior(int HP, boolean isAggressive, boolean isAttacking) {
        this.HP = HP;
        this.isAggressive = isAggressive;
        this.isAttacking = isAttacking;
        this.lastHitTime = LocalDateTime.MIN;
    }

    public void gotHit() {
        lastHitTime = LocalDateTime.now();
    }

    @Override
    public void loseHp(int hit) {
        this.HP -= hit;
    }

    @Override
    public boolean wasHitInLastTenSeconds() {
        return ChronoUnit.SECONDS.between(lastHitTime, LocalDateTime.now()) >= 10;
    }

    @Override
    public boolean isThePlayerDead() {
        return HP <= 0;
    }

    @Override
    public boolean isAggressive() {
        return isAggressive;
    }

    @Override
    public boolean isAttacking() {
        return isAttacking;
    }

    @Override
    public void startAttacking() {
        isAttacking = true;
    }

    @Override
    public void stopAttacking() {
        isAttacking = false;
    }

    @Override
    public void getAggressive() {
        isAggressive = true;
    }

    @Override
    public void getCalm() {
        isAggressive = false;
    }



}
