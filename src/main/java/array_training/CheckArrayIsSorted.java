package array_training;

/*
Проверить, является ли массив отсортированным
Условие: Напишите функцию, которая проверяет, отсортирован ли массив по возрастанию.
Примеры:
Вход: [1, 2, 3, 4] → Выход: true
Вход: [4, 3, 2, 1] → Выход: false
*/
public class CheckArrayIsSorted {

    public static boolean checkArrayIsSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {4, 3, 2, 1};
        int[] array3 = {1, 2, 2, 3, 4};

        System.out.println(checkArrayIsSorted(array1));
        System.out.println(checkArrayIsSorted(array2));
        System.out.println(checkArrayIsSorted(array3));
    }
}



/*
              Разница между array.length и array.length - 1

Как запомнить?
-  array.length  если обращаетесь только к array[i]
когда нужно обработать все элементы (например, поиск максимума, вывод массива).

-  array.length - 1  если обращаетесь к array[i + 1]
когда нужно сравнить текущий элемент со следующим (проверка сортировки, нахождение разниц между соседями).


1. Когда использовать array.length?
Полный проход по массиву (например, для поиска элемента или вывода всех значений).
Индексация начинается с 0, поэтому последний элемент имеет индекс array.length - 1.
Пример:

for (int i = 0; i < array.length; i++) {
    System.out.println(array[i]); // Выводим все элементы
}

Здесь i доходит до array.length - 1 (последний элемент), а условие i < array.length гарантирует, что мы не выйдем за границы.


2. Когда использовать array.length - 1?
Сравнение текущего элемента со следующим (как в задаче на проверку сортировки).
Если мы обращаемся к array[i + 1], то на последней итерации i должно быть array.length - 2, иначе будет ArrayIndexOutOfBoundsException.
Пример:

for (int i = 0; i < array.length - 1; i++) {
    if (array[i] > array[i + 1]) { // Сравниваем текущий и следующий
        return false;
    }
}

Если массив имеет длину 4, то последний i = 2 (т.к. i < 3), и array[i + 1] — это array[3] (последний элемент).
Если бы было i < array.length, то на i = 3 мы бы попытались взять array[4] — ошибка!
*/