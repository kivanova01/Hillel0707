package Lessons.lesson15;

public class hometask15 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = aExtension(a, 7);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
    }

    public static int[] aExtension(int[] a, int number) {
        int[] nextArr = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            nextArr[i] = a[i];
        }
        nextArr[nextArr.length - 1] = number;
        return nextArr;
    }
}
