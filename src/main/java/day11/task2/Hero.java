package day11.task2;

public abstract class Hero implements PhysAttack {
    public static double MAX_HEALTH = 100;
    public static double MIN_HEALTH = 0;
    public double physAtt;
    public double physDef;
    public double magicDef;
    public double health;

    public Hero() {
        health = 100;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double pAttack;
        pAttack = physAtt * (1 - hero.physDef);
        if (hero.health - pAttack < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= pAttack;
        }

    }
}
