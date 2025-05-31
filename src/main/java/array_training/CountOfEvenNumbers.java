package array_training;

/*
Подсчитать количество чётных чисел в массиве
Условие: Напишите функцию, которая считает, сколько чётных чисел содержится в массиве.
Примеры:
Вход: [2, 4, 6, 8] → Выход: 4
Вход: [1, 3, 5, 7] → Выход: 0
*/
public class CountOfEvenNumbers {

    public static int countOfEvenNumbers(int[] array) {

        int countEven = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven = countEven + 1;
            }
        }
        return countEven;
    }

    public static int countOfEvenNumbersForEach(int[] array) {

        int countEven = 0;

        for (int el : array
        ) {
            if (el % 2 == 0) {
                countEven++;
            }
        }
        return countEven;
    }

    public static void main(String[] args) {
        int[] array1 = {2, 4, 6, 8};
        int[] array2 = {1, 3, 5, 7};

        System.out.println("------for------");
        System.out.println(countOfEvenNumbers(array1)); // 4
        System.out.println(countOfEvenNumbers(array2)); // 0
        System.out.println("------for each------");
        System.out.println(countOfEvenNumbersForEach(array1)); // 4
        System.out.println(countOfEvenNumbersForEach(array2)); // 0
    }
}