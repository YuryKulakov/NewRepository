package day11.task2;

public class Magician extends Hero implements MagicAttack {
    double magicAtt = 20;

    public Magician() {
        physAtt = 5;
        magicDef = 0.8;

    }

    @Override
    public void magicalAttack(Hero hero) {
        double mAttack;
        mAttack = magicAtt * (1 - hero.magicDef);
        if (hero.health - mAttack < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= mAttack;
        }
    }

    @Override
    public void physicalAttack(Hero hero) {
        super.physicalAttack(hero);
    }

    @Override
    public String toString() {
        return "Magician{health= " + health + " }";
    }
}
