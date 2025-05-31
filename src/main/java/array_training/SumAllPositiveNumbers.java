package array_training;

/*
Найти сумму всех положительных чисел в массиве
Условие: Напишите функцию, которая суммирует только положительные числа в массиве.
Примеры:
Вход: [1, -2, 3, -4, 5] → Выход: 9 (1 + 3 + 5)
Вход: [-1, -2, -3]      → Выход: 0
*/
public class SumAllPositiveNumbers {

    public static int sumAllPositiveNumbers(int[] array) {

        int sumPositive = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sumPositive = sumPositive + array[i];
            }
        }
        return sumPositive;
    }

    public static int sumAllPositiveNumbersForEach(int[] array) {

        int sumPositive = 0;

        for (int el : array
        ) {
            if (el > 0) {
                sumPositive = sumPositive + el;
            }
        }
        return sumPositive;
    }

    public static void main(String[] args) {
        int[] array1 = {1, -2, 3, -4, 5};
        int[] array2 = {-1, -2, -3};

        System.out.println("------for------");
        System.out.println(sumAllPositiveNumbers(array1)); // 9
        System.out.println(sumAllPositiveNumbers(array2)); // 0
        System.out.println("------for each------");
        System.out.println(sumAllPositiveNumbersForEach(array1)); // 9
        System.out.println(sumAllPositiveNumbersForEach(array2)); // 0
    }
}