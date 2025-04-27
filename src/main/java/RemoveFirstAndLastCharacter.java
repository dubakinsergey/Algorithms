/*
Удалить первый и последний символ

        Описание:
        Это довольно просто.Ваша цель — создать функцию,которая удаляет первый и последний символы строки.
        Вам дан один параметр — исходная строка.Вам не нужно беспокоиться о строках,содержащих менее двух символов.
*/

/*
Строку -> массив символов char[] -> создадим "новый" массив и положим туда элементы с 1 по длина-1 из "старого" -> Обратно в строку
Нюанс: в "новый" массив кладем с 0 индекса!!!
*/

public class RemoveFirstAndLastCharacter {

    public static String remove(String str) {

        char[] charArrayOriginal = str.toCharArray(); // Метод toCharArray() преобразует строку str в массив символов char[]
        char[] resultArray = new char[charArrayOriginal.length - 2]; // Создаём новый массив символов, который будет на 2 элемента короче исходного (так как удаляем первый и последний символы)

        for (int i = 1; i < charArrayOriginal.length - 1; i++) { // Скопировать элементы из исходного массива, пропуская первый (индекс 0) и последний индекс
            resultArray[i - 1] = charArrayOriginal[i]; //Берем charArrayOriginal[1] и кладем в resultArray[0]
        }
        return new String(resultArray);  // Преобразование массива обратно в строку
    }

    public static void main(String[] args) {
        String testString = "Hello";
        String result = remove(testString);

        System.out.println("Исходная строка: " + testString);
        System.out.println("Результат: " + result);
    }
}

/*

  public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }

Метод substring() - это встроенный метод класса String, который возвращает часть строки.

Индексация:
-Начинается с 0
-Первый аргумент - включительно
-Второй аргумент - исключительно

Удаление первого символа:
String original = "Hello";
String result = original.substring(1);
// result = "ello"

Удаление последнего символа:
String original = "Hello";
String result = original.substring(0, original.length() - 1);
// result = "Hell"

Удаление первого и последнего символа
String original = "Hello";
String result = original.substring(1, original.length() - 1);
// result = "ell"
*/