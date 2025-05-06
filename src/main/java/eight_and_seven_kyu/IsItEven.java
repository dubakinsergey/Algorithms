package eight_and_seven_kyu;

/*
Это четно?

        В этом ката мы передаем число(n)в функцию.

        Ваш код определит,является ли переданное число четным(или нет).

        Функция должна возвращать либо значение true,либо значение false.

        Числа могут быть положительными или отрицательными,целыми или числами с плавающей точкой.

        Числа с плавающей точкой,не равной нулю,считаются НЕчетными для этого ката.
*/

public class IsItEven {

    public boolean isEven(double n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }
}

/*
   public boolean isEven(double n) {
        return n % 2 == 0;
    }
*/

/*
   public boolean isEven(double n) {
        return n % 2 == 0 ? true : false;
    }
*/