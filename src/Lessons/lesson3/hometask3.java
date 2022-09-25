package Lessons.lesson3;

import java.util.Scanner;

public class hometask3 {
    public static void main(String[] args) {

        System.out.print("Введите число 1,2,3: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if (number == 1) {
            System.out.println("Вы ввели число " + number);
        } else if (number == 2) {
            System.out.println("Вы ввели число " + number);
        } else if (number == 3) {
            System.out.println("Вы ввели число " + number);
        } else {
            System.out.println("Вы ввели число не равное 1, 2 или 3");
        }
    }
}

