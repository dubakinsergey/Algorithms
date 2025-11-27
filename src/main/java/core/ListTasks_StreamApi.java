package core;

import java.util.*;
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
    /*
    Comparator - мощный интерфейс для гибкой и сложной сортировки объектов
    1. Создание компараторов:
Comparator.naturalOrder()             // естественный порядок
Comparator.reverseOrder()             // обратный порядок
Comparator.comparing(String::length)  // по длине строки
Comparator.comparing(Person::getName) // по полю объекта
Comparator.comparingInt(String::length) // примитивная версия

2. Цепочка компараторов:
// Сортировка по нескольким полям
Comparator.comparing(Person::getLastName)
          .thenComparing(Person::getFirstName)
          .thenComparingInt(Person::getAge)

3. Обратные компараторы:
Comparator.comparing(String::length).reversed() // обратный порядок

4. Null-safe компараторы:
Comparator.nullsFirst(Comparator.naturalOrder()) // null в начало
Comparator.nullsLast(Comparator.naturalOrder())  // null в конец

                 Самые полезные на практике:
   Для строк:

Comparator.naturalOrder()          // алфавитный порядок
Comparator.reverseOrder()          // обратный алфавитный
String.CASE_INSENSITIVE_ORDER     // без учета регистра
Comparator.comparing(String::length) // по длине

   Для объектов:

Comparator.comparing(Product::getPrice) // по цене
Comparator.comparing(Product::getName).reversed() // по имени обратно
Comparator.comparing(Product::getCategory)
          .thenComparing(Product::getPrice) // по категории, потом по цене

   в Stream API:

// По алфавиту
list.stream().sorted(Comparator.naturalOrder())

// По длине строки
list.stream().sorted(Comparator.comparing(String::length))

// Без учета регистра
list.stream().sorted(String.CASE_INSENSITIVE_ORDER)

// По длине, потом по алфавиту
list.stream().sorted(Comparator.comparing(String::length)
                      .thenComparing(Comparator.naturalOrder()))

  С null элементами:

// Null в начало
list.stream().sorted(Comparator.nullsFirst(Comparator.naturalOrder()))

// Null в конец
list.stream().sorted(Comparator.nullsLast(Comparator.naturalOrder()))

           Практические примеры:

// Сортировка по длине строки
list.stream()
    .sorted(Comparator.comparing(String::length))
    .collect(Collectors.toList())

// Сортировка по нескольким критериям
list.stream()
    .sorted(Comparator.comparing(String::length)
                      .thenComparing(Comparator.naturalOrder()))
    .collect(Collectors.toList())

// Обратная сортировка с null в конце
list.stream()
    .sorted(Comparator.nullsLast(Comparator.reverseOrder()))
    .collect(Collectors.toList())
*/
    public static List<String> sortReverseAlphabetically_8(List<String> list) {

        if (list == null) {
            return new ArrayList<>();
        }

        return list.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    //    Задача 9: Отсортировать список по длине строки
    public static List<String> sortListByStringLength_9(List<String> list) {

        if (list == null) {
            return new ArrayList<>();
        }

        return list.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(String::length)) // компаратор по длине строки
                .collect(Collectors.toList());
    }

    //       Задача 9: Сортировка по длине, потом по алфавиту:
    public static List<String> sortByLengthThenAlphabetically_9(List<String> list) {

        if (list == null) {
            return new ArrayList<>();
        }

        return list.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(String::length)       // сначала по длине, потом по алфавиту
                        .thenComparing(Comparator.naturalOrder())) // при равной длине - сортировка по алфавиту  ---> .thenComparing(String::compareTo) // эквивалентно
                .collect(Collectors.toList());
    }

    //    Задача 10: Найти самый длинный элемент
    public static String longestElement_10(List<String>list){

        if (list == null || list.isEmpty()) {
            return "not found";
        }

       Optional<String> listReversed = list.stream()
                .filter(Objects::nonNull)
               .sorted(Comparator.comparing(String::length).reversed())
               .findFirst(); // отсортируй в обратном порядке и возьми первый

      return listReversed.orElse("not found");
    }

    //    Задача 10: Найти самый длинный элемент (Через .max())
    public static String longestElement_Two_10(List<String>list){

        if (list == null || list.isEmpty()) {
            return "not found";
        }

       return list.stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparing(String::length))
                .orElse("not found");
    }

     //    Задача 11: Найти общее количество символов во всех строках
    public static Integer totalNumberCharactersInAllLines_11(List<String>list){

        if (list == null || list.isEmpty()) {
            return 0;
        }

      return list.stream()
                .filter(Objects::nonNull)
              .mapToInt(String::length) // IntStream (примитивы)
              .sum();                   // работа с примитивами
    }
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
        System.out.println(alphabeticalList_8(list));
        System.out.println(sortReverseAlphabetically_8(list));
        System.out.println(sortListByStringLength_9(list));
        System.out.println(sortByLengthThenAlphabetically_9(list));
        System.out.println(longestElement_10(list));
        System.out.println(longestElement_Two_10(list));
    }
}
/*
Сортировка и агрегирующие операции

Задача 12: Объединить все элементы в одну строку через запятую
*/