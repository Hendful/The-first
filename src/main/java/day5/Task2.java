package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike("Honda", "зелёный", 1987);

        System.out.println("Модель мотоцикла: " +motorbike1.getModel());
        System.out.println("Цвет мотоцикла: " +motorbike1.getColor());
        System.out.println("Год выпуска: " +motorbike1.getYearRelease());
    }
}
class Motorbike{
    private String model;
    private String color;
    private int yearRelease;

    public Motorbike(String model, String color, int yearRelease){
        this.model = model;
        this.color = color;
        this.yearRelease = yearRelease;

    }
    public String getModel(){
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getYearRelease() {
        return yearRelease;
    }
}