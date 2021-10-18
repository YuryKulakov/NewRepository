package day11.task2;

public class Paladin extends Hero implements Healer {
    public double magicAtt;

    public Paladin() {
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;
    }

    @Override
    public void physicalAttack(Hero hero) {
        super.physicalAttack(hero);
    }

    @Override
    public String toString() {
        return "Paladin{health= " + health + " }";
    }

    @Override
    public void healHimself() {

        if (health + 25 > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += 25;
        }
    }

    @Override
    public void healTeammate(Hero hero) {

        if (hero.health + 10 > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += 10;
        }
    }
}
