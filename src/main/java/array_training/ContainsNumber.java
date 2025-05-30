package array_training;

/*
Проверить, есть ли в массиве заданное число
Условие: Напишите функцию, которая принимает массив и число,
а затем возвращает true, если число есть в массиве, и false — если нет.
Примеры:
Вход: [3, 5, 7, 9]  число 5 → Выход: true
Вход: [1, 2, 3]     число 4 → Выход: false
*/
public class ContainsNumber {
    public static boolean containsNumber(int[] array, int number) {

        boolean message = false;

        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                message = true;
                break;
            }
        }
        return message;
    }

    public static boolean containsNumberForEach(int[] array, int number) {

        for (int el : array
        ) {
            if (number == el) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int[] array1 = {3, 5, 7, 9};
        int[] array2 = {1, 2, 3};
        System.out.println(containsNumber(array1, 5)); //true
        System.out.println(containsNumber(array2, 4)); //false

        System.out.println(containsNumberForEach(array1, 5)); //true
        System.out.println(containsNumberForEach(array2, 4)); //false
    }
}