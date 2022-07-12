package day11.task1;

public class Courier implements Worker{

    private int salary;
    private boolean isPlayed;
    private Warehouse w;

    public Courier(Warehouse w){
        this.w = w;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPlayed() {
        return isPlayed;
    }

    @Override
    public String toString() {
        return "Заработная плата = " + salary +
                ", был выплачен бонус или нет = " + isPlayed +
                ", количество собранного товара = " + w.getCountDeliveredOrders();
    }

    @Override
    public void doWork() {
        salary += 100;
        w.incrementDeliveredOrders();

    }

    @Override
    public void bonus() {
        if (w.getCountDeliveredOrders() < 10000){
            System.out.println("Бонус пока не доступен");
        } else if (!isPlayed && w.getCountDeliveredOrders() == 10000) {
            salary += 50000;
            isPlayed = true;
        } else if (w.getCountDeliveredOrders() > 10000){
            System.out.println("Бонус уже был выплачен");
        }
    }
}
