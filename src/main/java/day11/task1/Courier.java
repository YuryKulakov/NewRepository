package day11.task1;

public class Courier implements Worker {
    int salary = 0;
    String isPayed="";
    private Warehouse warehouse;
    private static final int SALARY=100;
    private boolean bonus_payed = true;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
        this.isPayed = isPayed;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getIsPayed() {
        return isPayed;
    }

    public void setIsPayed(String isPayed) {
        this.isPayed = isPayed;
    }

    @Override
    public String toString() {
        return "Выплата курьеру| " +
                "зарплата: " + salary +
                ", бонусы'" + isPayed + '\'';
    }

    public void doWork() {
        warehouse.countDO();
        salary += SALARY;
    }


    public void bonus() {
        if (warehouse.getCountDeliveredOrders() >= 10000 && bonus_payed) {
            isPayed += 50000;
            System.out.println("Вам начислен бонус "+isPayed);
            salary+=50000;
            bonus_payed = false;
        } else if(warehouse.getCountDeliveredOrders() <= 10000 && bonus_payed){
            System.out.println("Бонус пока не доступен.");
        }else{
            System.out.println("Бонус уже был выпачен.");
        }

    }
}
