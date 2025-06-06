package array_training;

import java.util.ArrayList;

/*
Найти все уникальные элементы в массиве
Условие: Напишите функцию, которая возвращает новый массив без повторяющихся элементов.
Примеры:
Вход: [1, 2, 2, 3, 4, 4]   → Выход: [1, 2, 3, 4]
Вход: ["a", "b", "a", "c"] → Выход: ["a", "b", "c"]
*/

public class FindAllUniqueElementsInArray {

    public static int[] findAllUniqueElementsInt(int[] array) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int el : array
        ) {
            if (!arrayList.contains(el)) {
                arrayList.add(el);
            }
        }

        // Создаем обычный массив нужного размера (по количеству уникальных элементов)
        int[] uniqueArray = new int[arrayList.size()];

        // Копируем элементы из ArrayList в обычный массив
        for (int i = 0; i < arrayList.size(); i++) {
            uniqueArray[i] = arrayList.get(i);
        }
        return uniqueArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 2, 3, 4, 4};
        System.out.println("Original array:");
        printArray(array1);

        int[] uniqueArray = findAllUniqueElementsInt(array1);
        System.out.println("Array with unique elements:");
        printArray(uniqueArray);
    }
}

/*
Ключевые моменты:
1. ArrayList используется как промежуточное хранилище, потому что:
Мы заранее не знаем, сколько уникальных элементов будет
Он позволяет динамически добавлять элементы

2. Проверка на уникальность:
Метод contains() проверяет, есть ли элемент уже в списке
Если элемента нет (! перед условием), мы его добавляем

3. Преобразование в массив:
Сначала создаем массив нужного размера (arrayList.size())
Затем копируем элементы по одному

4. Особенности работы:
Порядок элементов сохраняется (первое вхождение остается)
Все последующие дубликаты игнорируются
Временная сложность O(n²) из-за метода contains()

5. Пример работы:
Вход: [1, 2, 2, 3, 4, 4]
После обработки в ArrayList: [1, 2, 3, 4]
Выходной массив: [1, 2, 3, 4]
*/