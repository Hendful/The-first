package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("KIA RIO");
        car1.setColor("красный");
        car1.setYearRelease(2017);

        System.out.println("Марка автомобиля: " +car1.getModel()+ ", имеет " +car1.getColor()+ " цвет. Выпуск " +car1.getYearRelease()+ " года.");
    }
}
class Car{
    private String model;
    private String color;
    private int yearRelease;

    public void setModel(String carModel){
        model = carModel;
    }
    public String getModel() {
        return model;
    }

    public void setColor(String carColor) {
        color = carColor;
    }
    public String getColor() {
        return color;
    }

    public void setYearRelease(int carYearRelease) {
        yearRelease = carYearRelease;
    }
    public int getYearRelease() {
        return yearRelease;
    }
}
