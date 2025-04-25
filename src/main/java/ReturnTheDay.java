/*
Верните день

Завершите функцию, которая возвращает день недели в соответствии с введенным числом:

1возвращается"Sunday"
2возвращается"Monday"
3возвращается"Tuesday"
4возвращается"Wednesday"
5возвращается"Thursday"
6возвращается"Friday"
7возвращается"Saturday"
В противном случае возвращается"Wrong, please enter a number between 1 and 7"

*/

public class ReturnTheDay {

    public static String getDay(int n) {
        return switch (n) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> ("Wrong, please enter a number between 1 and 7");
        };
    }

    public static void main(String[] args) {
        System.out.println(getDay(1));
        System.out.println(getDay(3));
        System.out.println(getDay(7));
        System.out.println(getDay(0));
    }
}

/*
public class DayOfWeek {
    public static String getDay(int n) {
        return n == 1 ? "Sunday" : n == 2 ? "Monday" : n == 3 ? "Tuesday" : n == 4 ? "Wednesday" : n == 5 ? "Thursday" :
                n == 6 ? "Friday" : n == 7 ? "Saturday" : "Wrong, please enter a number between 1 and 7";
    }
}
*/