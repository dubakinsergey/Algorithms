/*
Что находится между ними?

Описание:
        Завершите функцию, которая принимает два целых числа(a,b, где a<b) и возвращает массив
        всех целых чисел между входными параметрами,включая их самих.

        Например:

        a=1
        b=4
        -->[1,2,3,4]
*/

import java.util.Arrays;

public class WhatIsBetween {

    public static int[] between(int a, int b) {

        int[] arr = new int[b - a + 1]; // Размер массива вычисляется как b - a + 1, потому что нам нужно включить оба числа a и b, а также все числа между ними.

        for (int i = 0; i < arr.length; i++) {
            arr[i] = a + i;
        }
        return arr;
    }

/*
a = 1, b = 4
i = 0 → arr[0] = 1 + 0 = 1
i = 1 → arr[1] = 1 + 1 = 2
i = 2 → arr[2] = 1 + 2 = 3
i = 3 → arr[3] = 1 + 3 = 4
Получаем массив [1, 2, 3, 4].
*/

    public static void main(String[] args) {
        System.out.println(Arrays.toString(between(1, 4)));
        System.out.println(Arrays.toString(between(-2, 2)));
        System.out.println(Arrays.toString(between(100, 100))); // Если a == b, массив будет содержать один элемент ([a])  В данном случае [100]
    }
}