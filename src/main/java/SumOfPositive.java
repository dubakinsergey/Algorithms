/*
Сумма положительных

Получаете массив чисел, возвращаете сумму всех положительных единиц.

Пример
[1, -4, 7, 12]=>1+7+12=20

Примечание
Если суммировать нечего, то по умолчанию используется сумма 0.

*/

public class SumOfPositive {
    public static int sum(int[] arr) {

        int elementSum = 0;

        for (int el : arr
        ) {
            if (el >= 0) {
                elementSum = elementSum + el;
            }
        }
        return elementSum;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3, 4, 5}));
        System.out.println(sum(new int[]{1, -2, 3, 4, 5}));
        System.out.println(sum(new int[]{}));
        System.out.println(sum(new int[]{-1, -2, -3, -4, -5}));
        System.out.println(sum(new int[]{-1, 2, 3, 4, -5}));
    }
}

/*
    public static int sum(int[] arr) {
        return Arrays.stream(arr).filter(el -> el > 0).sum();
    }
*/