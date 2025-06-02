package array_training;

/*
Простая сортировка с использованием двух циклов
*/
public class SimpleSort {

    public static void simpleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    // Обмен элементов
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    // Вспомогательный метод для вывода массива
    public static void printArray(int[] array) {
        // Цикл for для перебора элементов
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");  // Выводим элемент с пробелом
        }
        System.out.println();  // Переход на новую строку после вывода массива
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};

        System.out.println("Исходный массив:");
        printArray(arr);

        simpleSort(arr);

        System.out.println("Отсортированный массив:");
        printArray(arr);

       /*
                 Посмореть без вспомогательного метода

        System.out.println("-----before-----");
        System.out.println(Arrays.toString(arr));
        System.out.println("-----after sorted-----");
        simpleSort(arr);
        System.out.println(Arrays.toString(arr));

       */
    }
}