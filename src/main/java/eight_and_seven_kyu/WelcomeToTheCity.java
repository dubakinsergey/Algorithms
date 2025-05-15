package eight_and_seven_kyu;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
Добро пожаловать в город

Создайте метод, который принимает в качестве входных данных имя, город и штат для приветствия человека.
Обратите внимание, что это name будет массив, состоящий из одного или нескольких значений,
которые должны быть объединены вместе с одним пробелом между ними, а длина массива name в тестовых случаях будет меняться.

Пример:
['John', 'Smith'], 'Phoenix', 'Arizona'
Этот пример вернет строку
Hello, John Smith! Welcome to Phoenix, Arizona!
*/
public class WelcomeToTheCity {

    public String sayHello(String[] name, String city, String state) {
        // Объединяем элементы массива name в одну строку с пробелами между ними
        // Например, ["John", "Smith"] -> "John Smith"
        String fullName = Arrays.stream(name)          // Создаем поток из массива
                .collect(Collectors.joining(" "));  // Собираем элементы с разделителем " "

        // Формируем итоговую строку приветствия
        return "Hello, " + fullName + "! Welcome to " + city + ", " + state + "!";
    }

    public static void main(String[] args) {
        WelcomeToTheCity greeter = new WelcomeToTheCity();

        // Тестовые данные
        String[] name1 = {"John", "Smith"};
        String city1 = "Phoenix";
        String state1 = "Arizona";

        // Вызываем метод и выводим результат
        System.out.println(greeter.sayHello(name1, city1, state1));
        // Ожидаемый вывод: Hello, John Smith! Welcome to Phoenix, Arizona!

        // Дополнительные тесты для демонстрации работы с разными входными данными
        String[] name2 = {"Alice"};
        System.out.println(greeter.sayHello(name2, "New York", "NY"));
        // Ожидаемый вывод: Hello, Alice! Welcome to New York, NY!

        String[] name3 = {"Dr.", "Martin", "Luther", "King", "Jr."};
        System.out.println(greeter.sayHello(name3, "Atlanta", "Georgia"));
        // Ожидаемый вывод: Hello, Dr. Martin Luther King Jr.! Welcome to Atlanta, Georgia!
    }
}

/*
Ключевые моменты для понимания:

Метод Arrays.stream():
Преобразует массив в поток (Stream) элементов
Позволяет использовать мощные операции обработки данных

Метод Collectors.joining():
Собирает элементы потока в одну строку
Принимает разделитель (в нашем случае пробел " ")
Эффективно объединяет строки без лишних операций конкатенации

Обработка массива name:
Массив может содержать от 1 до N элементов
Все элементы объединяются с пробелами между ними
Например: ["Mr", "John", "Doe"] → "Mr John Doe"

Форматирование результата:
Используется простая конкатенация строк
Шаблон строго соответствует требуемому формату
*/