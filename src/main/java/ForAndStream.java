import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ForAndStream {


    //Сумма элементов массива через for
    public static int sumFor() {

        int[] n = {1, 2, 3, 4, 5};

        int sum = 0;

        for (int i = 0; i < n.length; i++) {
            sum = sum + n[i];
        }
        return sum;
    }

    //Сумма элементов массива через Stream
    public static int sumStream() {

        int[] n = {1, 2, 3, 4, 5};

        return Arrays.stream(n).sum();
    }


    //В квадрат каждое переданное число из массива, а затем, суммировать результаты (через Stream)
    public static int sumStreamSquare() {

        int[] n = {1, 2, 3, 4, 5};

        return Arrays.stream(n)
                .map(el -> el * el)
                .sum();
    }

    /*
Метод .map() — это промежуточная операция (intermediate operation), которая:

-Преобразует каждый элемент потока
-Возвращает новый поток с преобразованными элементами
-Не изменяет исходные данные

Важные особенности:
-Не изменяет исходную коллекцию — создаёт новый поток
-Ленивая операция — выполняется только при вызове терминальной операции (как sum())
-Может менять тип данных (если используете map() для объектов)

Разница между .map() и .filter():
.map() — преобразует элементы

.filter() — отбирает элементы (без изменения)
   */

    public static List<Integer> onlyEvenStream() {

        int[] n = {1, 2, 3, 4, 5};

        List<Integer> list = Arrays.stream(n)
                .filter(num -> num % 2 == 0)
                .boxed()    // конвертирует int в Integer (т.к. List не работает с примитивами)
                .collect(Collectors.toList()); //собирает элементы в список
        return list;
    }

    // Сумма нечетных чисел через Stream
    public static int sumOddStream() {

        int[] n = {1, 2, 3, 4, 5};

        return Arrays.stream(n)
                .filter(el -> el % 2 != 0)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(sumFor() + " - sumFor"); // 15 - sumFor
        System.out.println(sumStream() + " - sumStream"); // 15 - sumStream
        System.out.println(sumStreamSquare() + " - sumStreamSquare"); // 55 - sumStreamSquare
        System.out.println(onlyEvenStream() + " - onlyEvenStream"); // [2, 4] - onlyEvenStream
        System.out.println(sumOddStream() + " - sumOddStream"); // 9 - sumOddStream
    }
}

/*
1. Создание Stream

Из списка:
List<Integer> list = List.of(1, 2, 3);
Stream<Integer> stream = list.stream();

Из массива:
int[] arr = {1, 2, 3};
IntStream stream = Arrays.stream(arr);

2. Основные операции
map – преобразует элементы (x → x * 2)

filter – оставляет элементы по условию (x → x > 2)

sorted – сортировка

distinct – убирает дубли

limit – берёт первые N элементов

skip – пропускает первые N элементов

3. Терминальные операции (завершают Stream)
forEach – что-то делает с каждым элементом

collect – собирает в коллекцию (Collectors.toList())

count – считает количество

sum / min / max / average – для числовых Stream (IntStream, DoubleStream)

reduce – свёртка (например, сумма)

4. Примеры

// Сумма чётных чисел, умноженных на 2
int sum = Arrays.stream(new int[]{1, 2, 3, 4})
        .filter(x -> x % 2 == 0)  // 2, 4
        .map(x -> x * 2)          // 4, 8
        .sum();                    // 12

// Собрать строки длиной > 3 в список
List<String> filtered = List.of("Java", "C++", "Python").stream()
        .filter(s -> s.length() > 3)
        .collect(Collectors.toList());  // ["Java", "Python"]


 Основные методы

Метод	         Что делает?	                                 Пример
.stream()	Создает поток из коллекции/массива	    Arrays.stream(arr) / list.stream()
.map()	    Преобразует каждый элемент	                  .map(x → x * 2)
.filter()	Оставляет элементы по условию	              .filter(x → x > 5)
.sorted()	Сортирует (можно с компаратором)	          .sorted() / .sorted(Comparator.reverseOrder())
.reduce()	Схлопывает элементы (например, сумма)	      .reduce(0, (a, b) → a + b)
.collect()	Преобразует поток обратно в коллекцию	      .collect(Collectors.toList())
.forEach()	Применяет действие к каждому элементу	      .forEach(System.out::println)
*/