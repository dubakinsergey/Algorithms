import java.util.Arrays;

/*
Удалить дубликаты из списка

Определите функцию, которая удаляет дубликаты из массива неотрицательных чисел и возвращает их в качестве результата.

Порядок последовательности должен оставаться прежним.

Примеры:

Input -> Output
[1, 1, 2] -> [1, 2]
[1, 2, 1, 1, 3, 2] -> [1, 2, 3]
*/
public class RemoveDuplicatesFromList {

    public static int[] distinct(int[] array) {

        if (array == null) {
            return new int[0];
        }
        int[] arrayUnique = Arrays.stream(array).distinct().toArray();
        return arrayUnique;
    }

    public static void main(String[] args) {
        int[] arrays1 = {1, 2, 1, 1, 3, 2};
        System.out.println(Arrays.toString(distinct(arrays1)));
    }
}