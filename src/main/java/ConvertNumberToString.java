/*
Преобразуйте число в строку!

Нам нужна функция, которая может преобразовать число (целое число) в строку.

Примеры (вход -> выход):
123  --> "123"
999  --> "999"
-100 --> "-100"*/
public class ConvertNumberToString {

    public static String numberToString(int num) {
        return Integer.toString(num);
    }

    public static void main(String[] args) {
        System.out.println(numberToString(123));
        System.out.println(numberToString(999));
        System.out.println(numberToString(-100));
    }
}