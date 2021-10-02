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
        warehouse.countDO();
        salary += SALARY;
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() >= 10000 && isPayed) {
            bonusPayed += 50000;
            System.out.println("Вам начислен бонус " + bonusPayed);
            salary += 50000;
            isPayed = false;
        } else if (warehouse.getCountDeliveredOrders() <= 10000 && isPayed) {
            System.out.println("Бонус пока не доступен.");
        } else {
            System.out.println("Бонус уже был выпачен.");
        }
    }
}
