package eight_and_seven_kyu;

import java.util.Arrays;

/*
Описание
Нам нужна функция, которая может преобразовать строку в число.
Какие способы достижения этого вы знаете?

Примечание: Не волнуйтесь, все входные данные будут строками,
и каждая строка является совершенно допустимым представлением целого числа.

Примеры
"1234" --> 1234
"605"  --> 605
"1405" --> 1405
"-7" --> -7
*/
public class ConvertStringToNumber {
    static String exception = "Ошибка, вводить только цифры !!!";

    public static int stringToNumber(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new RuntimeException(exception);
        }
    }

    public static void main(String[] args) {
        System.out.println(stringToNumber("1234"));
        System.out.println(stringToNumber("605"));
        System.out.println(stringToNumber("1405"));
        System.out.println(stringToNumber("-7"));
        System.out.println(stringToNumber("a"));
    }
}