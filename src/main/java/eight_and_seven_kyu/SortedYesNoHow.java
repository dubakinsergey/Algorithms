package eight_and_seven_kyu;

import java.util.Arrays;

/*
Сортировано? да? нет? как?

Завершите метод, который принимает массив целых чисел и возвращает одно из следующих значений:
"yes, ascending"- если числа в массиве отсортированы в порядке возрастания
"yes, descending"- если числа в массиве отсортированы в порядке убывания
"no"- в противном случае

Можно предположить, что массив всегда будет действителен и всегда будет один правильный ответ.
*/
public class SortedYesNoHow {

    public static String isSortedAndHow(int[] array) {
        // Флаги для отслеживания типа сортировки
        boolean ascending = true;   // предполагаем, что массив возрастает
        boolean descending = true; // предполагаем, что массив убывает

        // Проходим по массиву, сравнивая соседние элементы
        for (int i = 0; i < array.length - 1; i++) {
            // Если текущий элемент меньше следующего - массив не убывает
            if (array[i] < array[i + 1]) {
                descending = false;
            }
            // Если текущий элемент больше следующего - массив не возрастает
            else if (array[i] > array[i + 1]) {
                ascending = false;
            }
            // Если оба флага стали false, массив точно не отсортирован
            // Дальнейшая проверка не имеет смысла, можно выйти из цикла
            if (!ascending && !descending) {
                break;
            }
        }

        // Определяем результат на основе оставшихся флагов
        if (ascending) {
            return "yes, ascending";  // если сохранился флаг возрастания
        } else if (descending) {
            return "yes, descending"; // если сохранился флаг убывания
        } else {
            return "no";              // если оба флага сброшены
        }
    }

    public static void main(String[] args) {
        // Тестовые случаи
        int[] ascArr = {1, 2, 3, 4, 5};      // строго возрастает
        int[] descArr = {5, 4, 3, 2, 1};      // строго убывает
        int[] noSortedArr = {1, 5, 3, 4, 2};  // не отсортирован
        int[] equalArr = {2, 2, 2, 2};        // все элементы равны (считается возрастающим)

        System.out.println(isSortedAndHow(ascArr));      // "yes, ascending"
        System.out.println(isSortedAndHow(descArr));     // "yes, descending"
        System.out.println(isSortedAndHow(noSortedArr));  // "no"
        System.out.println(isSortedAndHow(equalArr));     // "yes, ascending"
    }
}

/*
Ключевые моменты:
Два флага - мы начинаем с предположения, что массив может быть как возрастающим, так и убывающим.

Один проход - за один цикл проверяем оба условия, что делает алгоритм эффективным.

Ранний выход - если оба флага становятся false, дальнейшая проверка бессмысленна.

Особый случай с равными элементами - если все элементы равны, флаг ascending останется true,
что соответствует условию (такие массивы обычно считаются возрастающими).
*/