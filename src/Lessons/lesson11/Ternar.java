package Lessons.lesson11;

public class Ternar {
    public static void main(String[] args) {
        String str = "blablablal?";
        String str1 = "blablablal";
        check(str);
        check(str1);

        checkWithTernar(str);
        checkWithTernar(str1);
    }

    public static void check(String str) {
        var lastChar = str.charAt(str.length() - 1);
        if (lastChar == '?') {
            System.out.println("Question in the end");
        } else {
            System.out.println("without question");
        }
    }

    public static void checkWithTernar(String str) {
        var lastChar = str.charAt(str.length() - 1);
        System.out.println(lastChar == '?' ? "Question in the end" : "without question");
    }
}
