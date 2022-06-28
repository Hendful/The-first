package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airbus380 = new Airplane("Airbus A380", 2004, 67.90, 280.5);
        Airplane boeing747 = new Airplane("Boeing 747-8", 2011, 76.25, 300.1);
        Airplane.compareAirplanes(airbus380, boeing747);

    }
}