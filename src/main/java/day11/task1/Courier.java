package day11.task1;

public class Courier extends WorkerAbstract {
    private static final int SALARY = 100;

    public Courier(Warehouse warehouse) {
        super(warehouse);
    }

    @Override
    public String toString() {
        return "Выплата курьеру| " +
                "зарплата: " + salary +
                ", бонусы'" + bonusPayed + '\'';
    }

    @Override
    public void doWork() {
        super.doWork();
        salary += SALARY;
    }

    @Override
    public void bonus() {
        super.bonus();
    }
}
