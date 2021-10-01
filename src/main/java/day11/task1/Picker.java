package day11.task1;

public class Picker implements Worker {
    int salary;
    String isPayed ="";
    private Warehouse warehouse;
    private static final int SALARY=80;
    boolean bonus_payed=true;

    public Picker(Warehouse warehouse){
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
        return "Выплата сборщику| " +
                "зарплата: " + salary +
                ", бонус: '" + isPayed + '\'';
    }
    public void doWork(){
        warehouse.countPO();
        salary +=SALARY;
    }
    public void bonus(){
        if(warehouse.getCountPickedOrders()>= 10000 && bonus_payed){
            isPayed+=70000;
            System.out.println("Вам начислен бонус "+isPayed);
            salary+=70000;
            bonus_payed = false;
        }else if(warehouse.getCountPickedOrders()<= 10000 && bonus_payed){
            System.out.println("Бонус пока не доступен");
        }else{
            System.out.println("Бонус уже был выплачен.");
        }
    }

}
