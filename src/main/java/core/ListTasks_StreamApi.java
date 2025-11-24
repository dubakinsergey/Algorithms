package core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ListTasks_StreamApi {

    //    Задача 1: Отфильтровать элементы, длина которых больше 5 символов
    public static List<String> filterElementLengthGreaterThan5Symbols_1(List<String> list) {

        if (list == null) {
            return new ArrayList<>(); // защита от null списка
        }

        return list.stream()
                .filter(Objects::nonNull) // игнорируем null элементы
                .filter(el -> el.length() > 5)
                .collect(Collectors.toList());
    }

    //     Задача 2: Преобразовать все элементы в верхний регистр
    public static List<String> elementToUpperCase_2(List<String> list) {

        if (list == null) {
            return new ArrayList<>(); // защита от null списка
        }

        return list.stream()
                .filter(Objects::nonNull)
                .map(el -> el.toUpperCase())
                .collect(Collectors.toList());
    }

    //    Задача 3: Найти первый элемент, который начинается на "b", или вернуть "not found"
    public static String firstElementStartsWithB_3(List<String> list) {

        if (list == null) {
            return "not found";
        }

        return list.stream()
                .filter(Objects::nonNull)
                .filter(el -> el.toLowerCase().startsWith("b"))
                .findFirst()
                .orElse("not found");
    }

    //    Задача 4: Создать список длин каждого слова
    public static List<Integer> createListOfWordLengths_4(List<String> list) {

        if (list == null) {
            return new ArrayList<>();
        }

        return list.stream()
                .filter(Objects::nonNull)
                .map(String::length) //  .map(el -> el.length())
                .collect(Collectors.toList());
    }

    // Задача 5: Проверить, что все элементы начинаются с буквы в нижнем регистре
    // Нужно проверить, что строка не начинается с заглавной буквы (но допускаются цифры, пробелы)
    /*
    .allMatch(predicate)
Проверяет, что ВСЕ элементы удовлетворяют условию
Возвращает true только если ВСЕ элементы = true
Возвращает false если ХОТЯ БЫ ОДИН элемент = false
    */
    public static boolean elementsBeginWithLowercaseLetter_5(List<String> list) {

        if (list == null || list.isEmpty()) {
            return false;
        }

        return list.stream()
                .filter(Objects::nonNull)
                .filter(el -> !el.isEmpty())
                .allMatch(el -> el.charAt(0) == el.toLowerCase().charAt(0));
    }

    // Задача 5: Проверить, что все элементы начинаются с буквы в нижнем регистре
    // Нужно проверить, что строка начинается именно с буквы в нижнем регистре (строгая проверка)
    /*
    Character - утилитный класс для работы с одиночными символами (char)

    Проверки типа символов:
Character.isLetter('A')      // true - буква ли?
Character.isDigit('5')       // true - цифра ли?
Character.isWhitespace(' ')  // true - пробельный символ?
Character.isLowerCase('a')   // true - нижний регистр?
Character.isUpperCase('A')   // true - верхний регистр?
Character.isLetterOrDigit('a') // true - буква или цифра?

    Преобразование регистра:
Character.toLowerCase('A')   // 'a'
Character.toUpperCase('a')   // 'A'

    Сравнение:
Character.compare('a', 'b')  // -1 (сравнение двух char)
    */
    public static boolean elementsBeginWithLowercaseLetter_Second_5(List<String> list) {

        if (list == null || list.isEmpty()) {
            return false;
        }

        return list.stream()
                .filter(Objects::nonNull)
                .filter(el -> !el.isEmpty())
                .allMatch(el -> Character.isLowerCase(el.charAt(0))); // проверяет именно буквы в нижнем регистре
    }

    //    Задача 6: Проверить, что ни один элемент не содержит пробелов
    /*
    .noneMatch()
    Проверяет, что НИ ОДИН элемент в stream не удовлетворяет условию.

          Логика работы:
     Возвращает true  - если ВСЕ элементы = false
     Возвращает false - если ХОТЯ БЫ ОДИН элемент = true

          Проверка что ни один элемент НЕ начинается с 'A' И НЕ заканчивается на 'Z'
     .noneMatch(s -> s.startsWith("A") && s.endsWith("Z"))
    */
    public static boolean noneElementsContainSpaces_6(List<String> list) {

        if (list == null) {
            System.out.println("List is null");
            return true;
        }

        return list.stream()
                .filter(Objects::nonNull)
                .filter(el -> !el.isEmpty()) // пустые строки игнорируются
                .noneMatch(el -> el.contains(" ")); // true если НИ ОДИН элемент не содержит пробелов
    }

    //    Задача 7: Найти любой элемент, длина которого равна 6
    /*
    Консистентность (Consistency) - это единообразие и предсказуемость в коде.
    Консистентность = делать одинаковые вещи одинаково, чтобы код был предсказуемым и простым в использовании.

    Почему консистентность важна:
    Легче понимать код
    Легче поддерживать и изменять
    Меньше багов из-за неожиданного поведения
    */
    public static String anyElementWhoseLengthSix_7(List<String> list) {

        if (list == null || list.isEmpty()) {
            return "not found";
        }

        return list.stream()
                .filter(Objects::nonNull)
                .filter(el -> el.length() == 6)
                .findAny() // находит ЛЮБОЙ подходящий элемент (не обязательно первый)
                .orElse("not found");
    }

    //    Задача 8: Отсортировать список по алфавиту
/*
         Производительность:
    .sorted() создает новый отсортированный stream
    Исходный список не изменяется

         Дополненительно:
.sorted(String.CASE_INSENSITIVE_ORDER) //Сортировка без учета регистра:
.sorted(Comparator.reverseOrder())     //Сортировка в обратном порядке:
.sorted()                             // Сортировка в естественном порядке (алфавитном для строк)
       Естественный порядок (с учетом регистра):
"123"       // цифры first
"Apple"     // заглавные буквы
"Zoo"       // заглавные буквы
"apple"     // строчные буквы
"zoo"       // строчные буквы

       Без учета регистра:
"apple", "Apple", "banana", "Banana"
*/
    public static List<String> alphabeticalList_8(List<String> list) {

        if (list == null || list.isEmpty()) {
            return new ArrayList<>();
        }

        return list.stream()
                .filter(Objects::nonNull)
                .sorted()        // сортировка в естественном порядке (алфавитном для строк)
                .collect(Collectors.toList());
    }

//    Задача 8: Сортировка в обратном порядке (дополнительно)

    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "apple", "banana", "cherry", "date", "elderberry", "fig",
                "grape", "kiwi", "lemon", "mango", "apple", "banana",
                "orange", "pear", "quince", "raspberry", "strawberry",
                "tomato", "watermelon", "blueberry", "blackberry",
                "pineapple", "coconut", "apricot", "Avocado", "123",
                "test element", "java", "stream", "api", "exercise",
                "programming", "collection", "framework", "development"
        );

        System.out.println(filterElementLengthGreaterThan5Symbols_1(list));
        System.out.println(elementToUpperCase_2(list));
        System.out.println(firstElementStartsWithB_3(list));
        System.out.println(createListOfWordLengths_4(list));
        System.out.println(elementsBeginWithLowercaseLetter_5(list));
        System.out.println(elementsBeginWithLowercaseLetter_Second_5(list));
        System.out.println(noneElementsContainSpaces_6(list));
        System.out.println(anyElementWhoseLengthSix_7(list));
        System.out.println(alphabeticalList_8(null));
    }
}
/*
Сортировка и агрегирующие операции

Задача 9: Отсортировать список по длине строки

Задача 10: Найти самый длинный элемент

Задача 11: Найти общее количество символов во всех строках

Задача 12: Объединить все элементы в одну строку через запятую
*/