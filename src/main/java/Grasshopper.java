/*
Исправить функцию

Я создал эту функцию, чтобы добавлять пять к любому числу, которое было передано в нее, и возвращать новое значение.
Она не выдает никаких ошибок, но возвращает неправильное число.

Можете ли вы помочь мне исправить эту функцию?*/

public class Grasshopper {
    public static int addFive(int num) {
        return num + 5;
    }

    public static void main(String[] args) {
        System.out.println(addFive(20));
    }
}