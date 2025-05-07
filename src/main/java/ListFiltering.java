import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Фильтрация списка

В этом ката вы создадите функцию,
которая принимает список неотрицательных целых чисел и строк
и возвращает новый список с отфильтрованными строками.

Пример
Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
Kata.filterList(List.of(1, "a", "b", 0, 15)) => List.of(1,0,15)
Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 123)) => List.of(1, 2, 123)
*/

public class ListFiltering {

    // через for
    public static List<Object> filterList(final List<Object> list) {
        List<Object> result = new ArrayList<>(); // 1. Создаём пустой список для результатов

        for (int i = 0; i < list.size(); i++) { // 2. Перебираем все элементы списка
            Object element = list.get(i);       // 3. Получаем текущий элемент

            if (element instanceof Integer) {   // 4. Проверяем, является ли элемент целым числом
                result.add(element);            // 5. Если да - добавляем в результат
            }
        }
        return result; // 6. Возвращаем отфильтрованный список
    }

    //через Stream
    public static List<Object> filterListStream(final List<Object> list) {
        return list.stream()                      // 1. Создаём поток из списка
                .filter(el -> el instanceof Integer) // 2. Фильтруем: оставляем только Integer
                .collect(Collectors.toList());      // 3. Собираем результат в новый список
    }

    public static void main(String[] args) {
        System.out.println(filterList(List.of(1, 2, "a", "b")));          // [1, 2]
        System.out.println(filterList(List.of(1, "a", "b", 0, 15)));     // [1, 0, 15]
        System.out.println(filterList(List.of(1, 2, "a", "b", "123")));  // [1, 2]
        System.out.println("------------");
        System.out.println(filterListStream(List.of(1, 2, "a", "b")) + " stream");          // [1, 2]
        System.out.println(filterListStream(List.of(1, "a", "b", 0, 15)) + " stream");     // [1, 0, 15]
        System.out.println(filterListStream(List.of(1, 2, "a", "b", "123")) + " stream");  // [1, 2]
    }
}

/*

Разберём .collect(Collectors.toList()) по шагам:
1. Контекст:
Это завершающая (терминальная) операция в Stream API,
которая собирает результаты обработки потока данных в коллекцию.

2. Аналогия из жизни:
Представьте, что вы:
Просеиваете песок через сито (filter())
Отобранные камешки нужно собрать в ведро
.collect(Collectors.toList()) — это как "собери всё в ведро (новый список)"

3. Составные части:
.collect() — метод "сбора" результатов
Collectors.toList() — конкретная инструкция "собрать в список"

4. Как работает:
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

List<String> result = names.stream()
                         .filter(name -> name.length() > 3)  // ["Alice", "Charlie"]
                         .collect(Collectors.toList());      // Собираем в новый список

5. Что происходит под капотом:
-Stream обрабатывает все элементы
-После фильтрации/преобразования остаются только нужные
-Collectors.toList() создаёт новый ArrayList
-Все подходящие элементы добавляются в этот список
-Возвращается готовый список

6. Важные особенности:
-Всегда создаёт новый список (исходная коллекция не изменяется)
-Сохраняет порядок элементов
-Для больших потоков использует внутреннюю оптимизацию

7. Альтернативы:
 // В множество вместо списка:
.collect(Collectors.toSet());

// В конкретный тип коллекции:
.collect(Collectors.toCollection(LinkedList::new));

8. Пример с числами:
List<Object> mixed = List.of(1, "a", 2, "b");
List<Object> numbers = mixed.stream()
                          .filter(x -> x instanceof Integer)
                          .collect(Collectors.toList());  // [1, 2]

9. Почему не просто toList()?
В Java 16+ появился сокращённый вариант:

.collect(Collectors.toList());  // До Java 16
.toList();                      // Java 16+ (возвращает неизменяемый список)

10. Практическое правило:
Используйте .collect(Collectors.toList()), когда нужно:
-Преобразовать поток обратно в коллекцию
-Сохранить все обработанные элементы
-Получить изменяемый список

Запомните: это "точка сбора" после всех операций фильтрации и преобразований в Stream API.
*/