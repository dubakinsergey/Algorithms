/*
Удалить восклицательные знаки

Напишите функцию RemoveExclamationMarks,которая удаляет все восклицательные знаки из заданной строки.
*/

public class RemoveExclamationMarks {

    static String removeExclamationMarks(String s) {
        return s.replace("!", "");
    }

    public static void main(String[] args) {
        System.out.println(removeExclamationMarks("Hello World!"));
        System.out.println(removeExclamationMarks("Hello World !1!2!"));
    }
}
/*
Метод replace класса String

String text = "apple banana apple";

// Замена символа
String result1 = text.replace('a', 'X');  // "Xpple bXnXnX Xpple"

// Замена подстроки
String result2 = text.replace("apple", "orange");  // "orange banana orange"

// Если подстрока не найдена
String result3 = text.replace("pear", "melon");  // "apple banana apple" (без изменений)


Особенности:
Не изменяет исходную строку, а возвращает новую (строки в Java неизменяемы).

Регистр имеет значение: replace("a", "b") не заменит "A".

Если подстрока для замены не найдена, возвращается исходная строка.
*/
