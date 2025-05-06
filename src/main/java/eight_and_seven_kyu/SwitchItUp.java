package eight_and_seven_kyu;

/*
Переключите это!

        При предоставлении числа между 0-9,вернуть его словами.
        Обратите внимание,что ввод гарантированно находится в диапазоне 0-9.

        Вход:1

        Выход:"One".

*/

public class SwitchItUp {

    public static String switchItUp(int number) {
        String result = switch (number) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> throw new IllegalArgumentException("Invalid number: " + number + ". Expected 0-9.");
        };
        return result;
    }

    public static void main(String[] args) {
        System.out.println(switchItUp(0));
        System.out.println(switchItUp(1));
        System.out.println(switchItUp(5));
        System.out.println(switchItUp(9));
        System.out.println(switchItUp(10)); ///выбросит ошибку
    }
}