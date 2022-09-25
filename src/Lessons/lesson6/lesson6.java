package Lessons.lesson6;

public class lesson6 {
    public static void main(String[] args) {
//        String text = "Hello I am Maks";
//        if (text.equalsIgnoreCase("Hello I am MAKS")) {
//            System.out.println("Ok");
//        } else {
//            System.out.println("Fail");
//        }
//
//        String text2 = "Hello I am Alex";
//        System.out.println(text2.indexOf("l"));
//        System.out.println(text2.lastIndexOf("l"));

//        int num = 1234567;
//        String text = String.valueOf(num);
//        System.out.println(text);

//        String a = "11";
//        int b = Integer.parseInt(a);
//        System.out.println(b);
//
//        String num2 = "123456";
//        int temp2 = Integer.parseInt(num2);
//        System.out.println(temp2);
//
//        double num3 = 5.4999;
//        System.out.println(Math.round(num3));
//        System.out.println(Math.floor(num3));
//        System.out.println(Math.ceil(num3));

//        float num3 = 5.25f;
//        System.out.println(Math.round(num3));
//        System.out.println(Math.floor(num3));
//        System.out.println(Math.ceil(num3));

        String[] a = {"Привет", "меня", "зовут", "Макс"};
        int n = a.length;
        String temp;

        for (int i = 0; i < n / 2; i++) {
            temp = a[n - i - 1];
            a[n - i - 1] = a[i];
            a[i] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите слова одной строкой через пробел");
//        String input = sc.nextLine();
//        int count = 0;
//        if (input.length() != 0) {
//            count++;
//            for (int i = 0; i < input.length(); i++) {
//                if (input.charAt(i) != " ") {
//                    count++;
//                }
//            }
//        }
//        System.out.println("Вы ввели" + count + "слов");
    }
}
