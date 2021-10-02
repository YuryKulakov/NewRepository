package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Warehouse warehouse1 = new Warehouse();
        Worker courier = new Courier(warehouse);
        Worker picker = new Picker(warehouse);
        Worker courier1 = new Courier(warehouse1);
        Worker picker1 = new Picker(warehouse1);
        businessProcess(courier);
        System.out.println(courier);
        System.out.println(warehouse);

        businessProcess(picker);
        System.out.println(picker);
        System.out.println(warehouse);

        courier1.doWork();
        picker1.doWork();
    }

    static void businessProcess(Worker worker) {
        for (int i = 1; i <= 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }
}
