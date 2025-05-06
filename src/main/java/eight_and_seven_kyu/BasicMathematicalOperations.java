package eight_and_seven_kyu;

/*
Базовые математические операции

Ваша задача — создать функцию, которая выполняет четыре основные математические операции.

Функция должна принимать три аргумента - операция(строка/символ), значение1(число), значение2(число).
Функция должна возвращать результат чисел после применения выбранной операции.

Примеры(Оператор, значение1, значение2) --> вывод
('+', 4, 7) --> 11
('-', 15, 18) --> -3
('*', 5, 5) --> 25
('/', 49, 7) --> 7
*/
public class BasicMathematicalOperations {

    public static Integer basicMath(String op, int v1, int v2) {
        if (op.equals("+")) {
            return v1 + v2;
        } else if (op.equals("-")) {
            return v1 - v2;
        } else if (op.equals("*")) {
            return v1 * v2;
        } else if (op.equals("/")) {
            return v1 / v2;
        } else {
            throw new IllegalArgumentException("Неизвестная операция: " + op);
        }
    }

    public static void main(String[] args) {
        System.out.println(basicMath("+", 4, 7));
        System.out.println(basicMath("-", 15, 18));
        System.out.println(basicMath("*", 5, 5));
        System.out.println(basicMath("/", 49, 7));
        System.out.println(basicMath("/", 49, 0));
    }
}

/*
Лучшеее решение

public class BasicOperations
{
  public static Integer basicMath(String op, int v1, int v2)
  {
  switch (op) {
		case "-":
			return v1 - v2;
		case "+":
			return v1 + v2;
		case "*":
			return v1 * v2;
		case "/": {
			if (v2 == 0)
				throw new IllegalArgumentException("Division by zero");
			return v1 / v2;
		}
		default:
			throw new IllegalArgumentException("Unknown operation: " + op);
		}
  }
}
*/