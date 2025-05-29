package array_training;

/*
Найти наибольшее целое число в массиве

Условие: Напишите функцию, которая принимает массив целых чисел и возвращает наибольший элемент.
Примеры:
Вход: [5, 10, -3, 8] → Выход: 10
Вход: [-1, -5, -2]   → Выход: -1
*/
public class FindLargest {
    public static int findLargest(int[] args) {

        int max = args[0];

        for (int i = 1; i < args.length; i++) {
            if (args[i] > max) {
                max = args[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array1 = {5, 10, -3, 8};
        int[] array2 = {-1, -5, -2};

        System.out.println(findLargest(array1)); // 10
        System.out.println(findLargest(array2)); // -1
    }
}