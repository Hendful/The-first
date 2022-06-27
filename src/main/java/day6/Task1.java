package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYearRelease(2017);
        car1.info();
        System.out.println(car1.yearDifference(2022));

        Motorbike motorbike1 = new Motorbike("Honda", "red", 1997);
        motorbike1.info();
        System.out.println(motorbike1.yearDifference(2010));

    }
}
