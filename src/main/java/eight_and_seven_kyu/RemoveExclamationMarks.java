package eight_and_seven_kyu;

/*
Удалить восклицательные знаки

Напишите функцию eight_and_seven_kyu.RemoveExclamationMarks,которая удаляет все восклицательные знаки из заданной строки.
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



Отличие от replaceAll():

replace() работает с фиксированными строками/символами.

replaceAll() принимает регулярное выражение (regex), что позволяет делать более сложные замены.

String str = "Hello123World456";
String lettersOnly = str.replaceAll("[0-9]", "");  // "HelloWorld" (удаляет все цифры)

Если нужно просто заменить подстроку без regex, лучше использовать replace(), так как он работает быстрее.
*/

/*
    static String removeExclamationMarks(String s) {

        char[] arr = s.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '!') {
                builder.append(arr[i]);
            }
        }

        return builder.toString();
    }
*/
