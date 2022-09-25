package Lessons.lesson11;

public class lesson11 {
    public static void main(String[] args) {
        int mouse = 5;
        int weight = 45;
        if (mouse != 0 & weight < 100) {
            System.out.println("можно кормить кота");
        } else {
            System.out.println("error");
        }
        if (mouse == 7 | weight < 100) {
            System.out.println("можно кормить кота");
        } else {
            System.out.println("error");
        }
        int a = 10;
        if (++a == 10 & ++a == 12) {
            ++a;
        }
        System.out.println(a);
    }
}
