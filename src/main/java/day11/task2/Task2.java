package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior(30,0,0.8,0,100);
        Paladin paladin = new Paladin(15,0,0.5,0.2,100);

        warrior.physicalAttack(paladin);

    }
}
