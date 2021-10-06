package day11.task2;

public abstract class Hero implements PhysAttack, MagicAttack {
    private static double MAX_HEALTH = 100;
    private static double MIN_HEALTH = 0;
    private double physAtt;
    private double physDef;
    private double magicDef;
    double health;

    public Hero(double physAtt, double magicAtt, double physDef, double magicDef,double health) {
        this.physAtt = physAtt;
        this.physDef = physDef;
        this.magicDef = magicDef;
        health = 100;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getPhysAtt() {
        return physAtt;
    }

    public void setPhysAtt(double physAtt) {
        this.physAtt = physAtt;
    }

    public double getPhysDef() {
        return physDef;
    }

    public void setPhysDef(double physDef) {
        this.physDef = physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
    }

    @Override
    public void physicalAttack(Hero hero) {
        physAtt = getPhysAtt() * getPhysDef();
        System.out.println(physAtt);
        health = MAX_HEALTH - physAtt;
        System.out.println(health);
    }

    @Override
    public void magicalAttack(Hero hero) {
        magicAtt = getMagicAtt() * getMagicDef();
        health = MAX_HEALTH - magicAtt;

    }
}
