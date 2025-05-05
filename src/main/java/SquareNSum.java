/*
Квадрат(n) Сумма

Дополните функцию квадратной суммы так, чтобы она возводила в квадрат
каждое переданное ей число, а затем суммировала результаты.

Например, [1, 2, 2] должно вернуться 9
*/

import java.util.Arrays;

public class SquareNSum {

    public static int squareSum(int[] n) {

        int sum = 0;

        for (int el : n
        ) {
            sum = sum + (el * el);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(squareSum((new int[]{1, 2, 2})));
        System.out.println(squareSum((new int[]{1, 2})));
        System.out.println(squareSum((new int[]{5, -3, 4})));
        System.out.println(squareSum((new int[]{})));
    }
}
/*
Через stream

   public static int squareSum(int[] n) {
        return Arrays.stream(n).map(el -> el * el).sum();
    }
*/