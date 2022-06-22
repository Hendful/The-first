package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество этажей в здании: ");
        int number = sc.nextInt();
        if (number >= 1 & number <= 4){
            System.out.println("Малоэтажный дом");
        } else if (number >= 5 & number <= 8){
            System.out.println("Среднеэтажный дом");
        } else if (number >=9) {
            System.out.println("Многоэтажный дом");
        } else{
            System.out.println("Ошибка ввода");
        }
    }
}
