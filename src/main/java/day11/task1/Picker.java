package day11.task1;

public class Picker implements Worker{

    private int salary;
    private boolean isPlayed;
    private Warehouse w;


    public Picker(Warehouse w) {
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
                ", количество собранного товара = " + w.getCountPickedOrders();
    }

    @Override
    public void doWork() {
        salary += 80;
        w.incrementPickedOrders();
    }

    @Override
    public void bonus() {
        if (w.getCountPickedOrders() < 10000){
            System.out.println("Бонус пока не доступен");
        } else if (!isPlayed && w.getCountPickedOrders() == 10000) {
            salary += 70000;
            isPlayed = true;
        } else if (w.getCountPickedOrders() > 10000){
            System.out.println("Бонус уже был выплачен");
        }
    }
}
