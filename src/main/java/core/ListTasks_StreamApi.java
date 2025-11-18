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
    }
}

/*
📋 Базовые операции: фильтрация и преобразование

        Задача 2: Преобразовать все элементы в верхний регистр
        Задача 3: Найти первый элемент, который начинается на "b", или вернуть "not found"
        Задача 4: Создать список длин каждого слова
*/
