/*
Сумма строк

Создайте функцию, которая принимает на входе 2 целых числа в виде строки и выводит сумму (также в виде строки):
Пример: ( Вход1, Вход2 -->Выход )

        "4",  "5" --> "9"
        "34", "5" --> "39"
        "", ""    --> "0"
        "2", ""   --> "2"
        "-5", "3" --> "-2"

Примечания:
Если какой-либо из входных данных представляет собой пустую строку, считайте ее нулем.
Входные данные и ожидаемый вывод никогда не превысят предел 32-битного целого числа со знаком ( 2^31 - 1)
*/

public class SumTheStrings {

    public static String sumStr(String a, String b) {

        int intA = a.isEmpty() ? 0 : Integer.parseInt(a);
        int intB = b.isEmpty() ? 0 : Integer.parseInt(b);
        int intSum = intA + intB;

        return String.valueOf(intSum);
    }

    public static void main(String[] args) {
        System.out.println(SumTheStrings.sumStr("", "0"));
    }
}

/*
Проверка на пустую строку:
Метод isEmpty() возвращает true, если строка пустая ("").
Если a пустая, то intA = 0, иначе строка преобразуется в число с помощью Integer.parseInt(a).

Тернарный оператор (? :)
// Эквивалентно:
int intA;
if (a.isEmpty()) {
    intA = 0;
} else {
    intA = Integer.parseInt(a);
}

Возврат результата в виде строки:
return String.valueOf(intSum);

String.valueOf(intSum) преобразует число обратно в строку.

Можно было бы написать return intSum + "";, но String.valueOf() считается более правильным и явным способом.
*/