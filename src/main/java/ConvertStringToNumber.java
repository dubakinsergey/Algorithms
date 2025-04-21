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
    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        System.out.println(stringToNumber("1234"));
        System.out.println(stringToNumber("605"));
        System.out.println(stringToNumber("1405"));
        System.out.println(stringToNumber("-7"));
    }
}