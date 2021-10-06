package day11.task2;

public class Shaman extends Hero implements Healer {

    public Shaman(int physAtt, int magicAtt, int physDef, int magicDef,int health) {
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
       health+=50;

    }

    @Override
    public void healTeammate(Hero hero) {
        health+=30;

    }
}
