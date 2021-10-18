package day11.task2;

public class Shaman extends Hero implements Healer, MagicAttack {

    double magicAtt;

    public Shaman() {
        physAtt = 10;
        physDef = 0.2;
        magicDef = 0.2;
        magicAtt = 15;
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
        return "Shaman{health= " + health + " }";
    }

    @Override
    public void healHimself() {
        health += 50;
        if (health > MAX_HEALTH) {
            health = MAX_HEALTH;
        }

    }

    @Override
    public void healTeammate(Hero hero) {
        hero.health += 30;
        if (hero.health > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        }


    }
}
