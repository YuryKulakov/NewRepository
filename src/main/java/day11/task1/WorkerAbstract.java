package day11.task1;

public class WorkerAbstract implements Worker {
    int salary;
    boolean isPayed = true;
    int bonusPayed;
    public Warehouse warehouse;

    public WorkerAbstract(Warehouse warehouse) {
        this.warehouse = warehouse;
        this.bonusPayed = bonusPayed;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public boolean isPayed() {
        return isPayed;
    }
    public void setPayed(boolean payed) {
        isPayed = payed;
    }
    public int getBonusPayed() {
        return bonusPayed;
    }
    public void setBonusPayed(int bonusPayed) {
        this.bonusPayed = bonusPayed;
    }
    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        warehouse.countDO();
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
