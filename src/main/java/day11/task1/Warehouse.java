package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

    public Warehouse() {
        this.countDeliveredOrders = countDeliveredOrders;
        this.countPickedOrders = countPickedOrders;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }
    public void setCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
    }
    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }
    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }

    public void countPO() {
        countPickedOrders++;
    }

    public void countDO() {
        countDeliveredOrders++;
    }

    @Override
    public String toString() {
        return "Склад| " +
                "Количество собранных заказов: " + countPickedOrders +
                ", количество доставленных заказов: " + countDeliveredOrders;
    }
}
