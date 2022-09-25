package Lessons.lesson7;

public class hometask7 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 10) + 10);
            System.out.print(array[i] + " ");
            sum += array[i];
        }
        System.out.println();
        System.out.print(sum / 10 + " ");
    }
}
