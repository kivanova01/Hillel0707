package Lessons.lesson13;

public class hometask13 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }
}

// Task 1
//    int i = 1;
//        int a = 3;
//        while (i <= 10) {
//            if (i == 3)
//                break;
//            i++;
//        }
//        System.out.println("Вот счастливое число!");