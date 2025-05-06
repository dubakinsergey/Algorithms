package eight_and_seven_kyu;

/*
Строка заглавная?

Задача
Создайте метод, который проверяет, состоит ли строка ВСЕХ ЗАГЛАВНЫХ букв.

Примеры (вход -> выход)
"c" -> False
"C" -> True
"hello I AM DONALD" -> False
"HELLO I AM DONALD" -> True
"ACSKLDFJSgSKLDFJSKLDFJ" -> False
"ACSKLDFJSGSKLDFJSKLDFJ" -> True
*/

public class IsTheStringUppercase {

    public static boolean isUpperCase(String s) {

        for (char el : s.toCharArray()
        ) {
            if (Character.isLowerCase(el)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUpperCase("c"));
        System.out.println(isUpperCase("C"));
        System.out.println(isUpperCase("hello I AM DONALD"));
        System.out.println(isUpperCase("HELLO I AM DONALD"));
        System.out.println(isUpperCase("ACSKLDFJSgSKLDFJSKLDFJ"));
        System.out.println(isUpperCase("ACSKLDFJSGSKLDFJSKLDFJ"));
    }
}