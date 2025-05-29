package array_training;

/*
Найти среднее арифметическое элементов массива

Условие: Напишите функцию, которая вычисляет среднее арифметическое всех чисел в массиве.
Примеры:
Вход: [1, 2, 3, 4, 5] → Выход: 3.0
Вход: [10, 20, 30]    → Выход: 20.0
*/
public class ArithmeticMean {

    public static double arithmeticMean(int[] args) {

        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            sum = sum + args[i];
        }
        return (sum / args.length);
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {10, 20, 30};

        System.out.println(arithmeticMean(array1));
        System.out.println(arithmeticMean(array2));
    }
}