package array_training;

import java.util.Arrays;

/*
Перевернуть массив
Условие: Напишите функцию, которая возвращает новый массив с элементами в обратном порядке.
Примеры:
Вход: [1, 2, 3, 4]    → Выход: [4, 3, 2, 1]
Вход: ["a", "b", "c"] → Выход: ["c", "b", "a"]
*/
public class ReverseArray {

    public static int[] reverseIntArray(int[] array) {

        int[] reversedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }

    public static String[] reverseStringArray(String[] array) {

        String[] reversedArray = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }


    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        String[] array2 = {"a", "b", "c"};
        System.out.println("----- int -----");
        System.out.println("Original: " + Arrays.toString(array1));
        System.out.println("Reversed: " + Arrays.toString(reverseIntArray(array1)));

        System.out.println("----- String -----");
        System.out.println("Original: " + Arrays.toString(array2));
        System.out.println("Reversed: " + Arrays.toString(reverseStringArray(array2)));
    }
}