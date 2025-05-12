package eight_and_seven_kyu;

/*
Самый высокий и самый низкий

В этом небольшом задании вам дана строка чисел, разделенных пробелами,
и вам нужно вернуть наибольшее и наименьшее число.

Примеры
highAndLow("1 2 3 4 5") // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"

Примечания
-Все номера действительны Int32, нет необходимости их проверять.
-Во входной строке всегда будет хотя бы одно число.
-Выходная строка должна состоять из двух чисел, разделенных одним пробелом,
причем наибольшее число должно быть первым.
*/

import java.util.Arrays;

public class HighestAndLowest {

    public static String highAndLow(String numbers) {

        // 1 Разбиваем строку на массив строк по пробелам
        // Например: "1 2 3" → ["1", "2", "3"]
        String[] numStrings = numbers.split(" ");

        // 2 Создаём массив для хранения чисел (int)
        int[] nums = new int[numStrings.length];

        // 3 Преобразуем каждую строку в число
        for (int i = 0; i < numStrings.length; i++) {
            nums[i] = Integer.parseInt(numStrings[i]); // "1" → 1, "2" → 2 и т.д.
        }

        // 4 Инициализируем max и min первым элементом массива
        // (На случай, если массив содержит всего 1 число)
        int max = nums[0];
        int min = nums[0];

        // 5 Проходим по всем числам и ищем max/min
        for (int num : nums) {
            if (num > max) {
                max = num; // Обновляем max, если текущее число больше
            }
            if (num < min) {
                min = num; // Обновляем min, если текущее число меньше
            }
        }

        // 6 Возвращаем результат в виде строки "max min"
        return max + " " + min;
    }

    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3 4 5"));    // Ожидаем: "5 1"
        System.out.println(highAndLow("1 2 -3 4 5"));   // Ожидаем: "5 -3"
        System.out.println(highAndLow("1 9 3 4 -5"));   // Ожидаем: "9 -5"
        System.out.println(highAndLow("10"));           // Ожидаем: "10 10" (только одно число)
    }
}

/*

Пояснение ключевых моментов
1 Разбиение строки (split(" "))
split(" ") делит строку по пробелам и возвращает массив строк.

Пример:
"1 2 -3" → ["1", "2", "-3"]

2 Преобразование строк в числа (Integer.parseInt())
Integer.parseInt() конвертирует строку в целое число (String → int).

Пример:
"5" → 5
"-3" → -3

3 Поиск максимума и минимума
Изначально max и min равны первому элементу массива.

Цикл for (int num : nums) перебирает все числа:

Если num > max, обновляем max.

Если num < min, обновляем min.

4 Возврат результата
Результат формируется как строка: max + " " + min.

Пример:
max = 5, min = -3 → "5 -3"

*/