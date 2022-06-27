package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airbus380 = new Airplane("Airbus A380", 0, 0, 280.5);
        airbus380.setYear(2004);
        airbus380.setLength(67.90);

        airbus380.fillUp(50000);
        airbus380.fillUp(270000);

        airbus380.info();
    }
}

class Airplane {
    private String manufacturer;
    private int year;
    private double length;
    private double weight;
    private int fuel = 0;

    public Airplane(String manufacturer, int year, double length, double weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    int fillUp(int n) {
        fuel += n;
        return n;
    }

    void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year +
                ", длина: " + length + ", вес: " + weight +
                ", количество топлива в баке: " + fuel);
    }
}
