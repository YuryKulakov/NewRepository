package day11.task1;

public class Picker extends WorkerAbstract {
    private static final int SALARY = 80;

    public Picker(Warehouse warehouse) {
        super(warehouse);
    }

    @Override
    public String toString() {
        return "Выплата сборщику| " +
                "зарплата: " + salary +
                ", бонусы'" + bonusPayed + '\'';
    }

    @Override
    public void doWork() {
            warehouse.countPO();
            salary += SALARY;
    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() >= 10000 && isPayed) {
            bonusPayed += 70000;
            System.out.println("Вам начислен бонус " + bonusPayed);
            salary += 70000;
            isPayed = false;
        } else if (warehouse.getCountPickedOrders() <= 10000 && isPayed) {
            System.out.println("Бонус пока не доступен.");
        } else {
            System.out.println("Бонус уже был выпачен.");
        }
    }
}
