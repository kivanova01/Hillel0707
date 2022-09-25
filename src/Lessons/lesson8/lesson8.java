package Lessons.lesson8;

public class lesson8 extends Cat {
    public static void main(String[] args) {
        int a = 100;
        double b = 1.1;
        String c = "Alex";

        System.out.println(add(a, a));
        System.out.println(add(b, b));
        System.out.println(add(c, c));


//        Cat cat = new Cat();
//        cat.sayHello();
//        System.out.println(name);

//        int n = 9;
//        int k = 4;
//        int m = n % k; // % - оператор деления по модулю
//        System.out.println(m);

        // 9-4=5
        // 5-4=1

//        int iYear, twoDigit;
//        iYear = 2013;
//        twoDigit = iYear % 100;
//        System.out.println(twoDigit);

    }

    public static int add(int a, int b) {
        return a += b;
    }

    public static double add(double a, double b) {
        return a += b;
    }

    public static String add(String a, String b) {
        return a.concat(b);
    }
}
