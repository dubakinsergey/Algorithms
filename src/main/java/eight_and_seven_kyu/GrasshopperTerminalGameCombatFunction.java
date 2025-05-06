package eight_and_seven_kyu;

/*
eight_and_seven_kyu.Grasshopper - Терминальная игровая боевая функция

Создайте боевую функцию, которая берет текущее здоровье игрока и количество полученного урона,
и возвращает новое здоровье игрока.
Здоровье не может быть меньше 0 .
*/

public class GrasshopperTerminalGameCombatFunction {

    public static int combat(int health, int damage) {
        int result = health - damage;
        if (health > 0 && damage < health) {
            return result;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(combat(10, 5));
        System.out.println(combat(5, 10));
        System.out.println(combat(-10, 5));
    }
}

/*
Альтернативное:

public static int combat(int health, int damage) {
    return (health < damage)? 0 : health-damage;
  }

Лучшее решение:

public static int combat(int health, int damage) {
    return Math.max(health - damage, 0);
}

Что делает строка Math.max(health - damage, 0)?
health - damage — вычисляет, сколько здоровья останется после атаки.

Math.max(X, 0) — выбирает большее значение между:

Полученным результатом (X = health - damage)

Нулём (0)

Что делает Math.max(a, b)?
Это стандартный метод Java, который возвращает наибольшее из двух чисел a и b.

Как это применяется в combat?
Вычисляем health - damage — это новое значение здоровья после атаки.

Сравниваем результат с 0:

Если health - damage > 0 → возвращается это значение (здоровье осталось).

Если health - damage <= 0 → возвращается 0 (персонаж "умер", здоровье не может быть отрицательным).
*/