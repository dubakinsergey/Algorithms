/*
Объем прямоугольного параллелепипеда

Нужен быстрый способ вычисления объема прямоугольного параллелепипеда
с тремя значениями: length, width и height параллелепипеда.

Напишите функцию, которая поможет выполнить эти вычисления.
*/

public class VolumeOfCuboid {
    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;
    }

    public static void main(String[] args) {
        System.out.println(getVolumeOfCuboid(1, 2, 2));
        System.out.println(getVolumeOfCuboid(6.3, 2, 5));
    }
}