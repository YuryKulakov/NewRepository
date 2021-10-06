package day11.task2;

public class Warrior extends Hero{

    public Warrior(double physAtt, double magicAtt, double physDef, double magicDef,double health) {
        super(physAtt, magicAtt, physDef, magicDef, health);
    }

    @Override
    public void magicalAttack(Hero hero) {

    }

    @Override
    public void physicalAttack(Hero hero) {

    }

    @Override
    public String toString() {
        return "Warrior{}";
    }
}
