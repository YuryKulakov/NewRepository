package day11.task2;

public class Magician extends Hero{
    private double magicAtt;
    public Magician(int physAtt, int magicAtt, int physDef, int magicDef,int health) {
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
        return "Magician{}";
    }
}
