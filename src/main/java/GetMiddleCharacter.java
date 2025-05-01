/*
Получить средний символ

Вам будет дана непустая строка. Ваша задача — вернуть средний символ(ы) строки.

Если длина строки нечетная, вернуть средний символ.
Если длина строки четная, вернуть 2 средних символа.

Примеры:
"test"    --> "es"
"testing" --> "t"
"middle"  --> "dd"
"A"       --> "A"
*/

public class GetMiddleCharacter {

    public static String getMiddle(String word) {

        int wordLength = word.length();

        if (wordLength % 2 == 1) {
            word = word.substring(word.length() / 2, word.length() / 2 + 1);
        } else if (wordLength % 2 == 0) {
            word = word.substring(word.length() / 2 - 1, word.length() / 2 + 1);
        }
        return word;
    }

    public static void main(String[] args) {
        System.out.println(getMiddle("testing"));
        System.out.println(getMiddle("test"));
    }
}