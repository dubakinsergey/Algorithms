package core;

import java.util.ArrayList;
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

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Banana");
        list.add("Date");

        System.out.println(checkListIsEmpty1(list));
        System.out.println(checkListIsSize2(4, list));
        System.out.println(checkContainsString3("Cherry", list));
        System.out.println(checkNotContainsString4("Grape", list));
        System.out.println(checkFirstElement5("Apple", list));
        System.out.println(checkLastElement6("Date", list));
        System.out.println(findIndexOfFirstOccurrence7("Banana", list));
        System.out.println(findIndexOfLastOccurrence8("Banana", list));
    }
}