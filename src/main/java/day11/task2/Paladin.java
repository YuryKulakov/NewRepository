package day11.task2;

public class Paladin extends Hero implements Healer{
    private double magicAtt;

    public Paladin(double physAtt, double magicAtt, double physDef, double magicDef,double health) {
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
        return "Paladin{}";
    }

    @Override
    public void healHimself() {
        health+=25;
    }

    @Override
    public void healTeammate(Hero hero) {
        health+=10;
    }
}
