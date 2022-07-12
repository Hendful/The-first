package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String string = "";
        for (int i = 0; i <= 20000; i++)
            string += i + " ";

        System.out.println(string);

        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));

        long startTime2 = System.currentTimeMillis();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= 20000; i++)
            stringBuilder.append(i).append(" ");

        System.out.println(stringBuilder);

        long stopTime2 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime2 - startTime2));

    }
}
