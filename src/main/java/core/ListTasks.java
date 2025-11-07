package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTasks {

    // Задача 1: Проверить, что список не пустой
    public static boolean checkListIsEmpty1(List<String> list) {
        return list.isEmpty();
    }

    // Задача 2: Проверить, что размер списка равен 5
    public static boolean checkListIsSize2(int number, List<String> list) {
        if (list.size() == number) return true;
        else return false;
    }

    // Задача 3: Проверить, что список содержит строку "Cherry"
    public static boolean checkContainsString3(String string, List<String> list) {
        return list.contains(string);
    }

    // Задача 4: Проверить, что список НЕ содержит строку "Grape"
    public static boolean checkNotContainsString4(String string, List<String> list) {
        return (!list.contains(string));
    }

    // Задача 5: Проверить, что первый элемент списка равен "Apple"
    public static boolean checkFirstElement5(String string, List<String> list) {
        return list.get(0).equals(string);
    }

    // Задача 6: Проверить, что последний элемент списка равен "Date"
    public static boolean checkLastElement6(String string, List<String> list) {
        return list.get(list.size() - 1).equals(string);
    }

    // Задача 7: Найти индекс первого вхождения "Banana" (ожидается 1)
    public static int findIndexOfFirstOccurrence7(String string, List<String> list) {
        return list.indexOf(string);
    }

    // Задача 8: Найти индекс последнего вхождения "Banana" (ожидается 3)
    public static int findIndexOfLastOccurrence8(String string, List<String> list) {
        return list.lastIndexOf(string);
    }

    // Задача 9: Добавить элемент "Elderberry" в конец списка
    public static List<String> addElementToTheEndList9(String string, List<String> list) {
        list.add(string);
        return list;
    }

    // Задача 10: Вставить элемент "Apricot" на позицию с индексом 1
    public static List<String> addElementToFirstIndex10(String string, List<String> list) {
        list.add(1, string); //Элементы с этого индекса и дальше сдвигаются вправо + Размер списка увеличивается на 1
        return list;
    }

    // Задача 11: Заменить элемент по индексу '{index}' на '{string}'
    public static List<String> replaceElementToIndex11(int index, String string, List<String> list) {
        list.set(index, string);
        return list;
    }

    // Задача 12: Удалить элемент "Banana" (первое вхождение)
    public static List<String> deleteElementToFirstOccurrence12(String string, List<String> list) {
        list.remove(string); //Элементы справа от удаленного сдвигаются влево + Размер списка уменьшается на 1
        return list;
    }

    // Задача 13: Удалить элемент по индексу '{index}'
    public static List<String> deleteElementByIndex13(int index, List<String> list) {
        list.remove(index);
        return list;
    }

    // Задача 14: Очистить список и проверить, что он пуст
    public static boolean clearListAndCheckIsEmpty14(List<String> list) {
        list.clear();
        return list.isEmpty();
    }

    // Задача 15: Создать новый список из элементов с индексами от 1 до 3 (включительно)
    public static List<String> getSubListByIndexRange15(int fromIndex, int toIndex, List<String> list) {
        List<String> newSublist = list.subList(fromIndex, toIndex);
        return newSublist;
    }

    // Задача 16: Проверить, что этот новый список содержит ["Banana", "Cherry", "Banana"]
    public static boolean checkSubListContent16(List<String> list, int fromIndex, int toIndex, List<String> expected) {
        return list.subList(fromIndex, toIndex).equals(expected);
    }

    // Задача 17: Удалить элементы с индексами от 1 до 3 из исходного списка
    public static List<String> removeSublistByIndexRange17(int fromIndex, int toIndex, List<String> list) {
        list.subList(fromIndex, toIndex).clear();
        return list;
    }

    // Задача 17: Удалить элементы с индексами от 1 до 3 из исходного списка
    // Вариант с созданием копии (если нужно сохранить оригинал):
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Banana");
        list.add("Date");

        list.forEach(System.out::println);
        System.out.println("------------------------");
        System.out.println(checkListIsEmpty1(list));
        System.out.println(checkListIsSize2(4, list));
        System.out.println(checkContainsString3("Cherry", list));
        System.out.println(checkNotContainsString4("Grape", list));
        System.out.println(checkFirstElement5("Apple", list));
        System.out.println(checkLastElement6("Date", list));
        System.out.println(findIndexOfFirstOccurrence7("Banana", list));
        System.out.println(findIndexOfLastOccurrence8("Banana", list));
        System.out.println(addElementToTheEndList9("Elderberry", list));
        System.out.println(addElementToFirstIndex10("Apricot", list));
        System.out.println(replaceElementToIndex11(2, "Cranberry", list));
        System.out.println(deleteElementToFirstOccurrence12("Banana", list));
        System.out.println(deleteElementByIndex13(0, list));
        System.out.println(clearListAndCheckIsEmpty14(list));
        System.out.println(getSubListByIndexRange15(1, 4, Arrays.asList("Apple", "Banana", "Cherry", "Banana", "Date")));
        System.out.println(checkSubListContent16(list, 1, 4, Arrays.asList("Banana", "Cherry", "Banana")));
        System.out.println(removeSublistByIndexRange17(1, 4, list));
    }
}