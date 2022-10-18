public class Arrays {
    public static void main(String[] args) {
//        Напишите программу, заполняющую массив из 20 элементов рандомными значениями в диапазоне от -10 до 10. Далее:
        int[] array = new int[20];
        int minPlus = 0;
        int maxMinus = 0;
        int plusPosition = 0;
        int minusPosition = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 21) - 10);
            System.out.println(array[i]);
        }
        // Поиск максимального отрицательного элемента массива
        for (int i = 0; i < array.length; i++) {
            if (array[i] < maxMinus) {
                maxMinus = array[i];
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (maxMinus < array[i] && array[i] < 0) {
                maxMinus = array[i];
                minusPosition = i;
            }
        }
        // Вывод максимального отрицательного элемента массива
        System.out.println("Максимальное отрицательное значение: " + maxMinus);
        // Поиск минимального положительного элемента массива
        for (int i = 0; i < array.length; i++) {
            if (array[i] > minPlus) {
                minPlus = array[i];
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (minPlus > array[i] && array[i] > 0) {
                minPlus = array[i];
                plusPosition = i;
            }
        }
        // Вывод минимального положительного элемента массива
        System.out.println("Минимальное положительное значение :" + minPlus);
        // Изменение мест минимального положительного и максимального отрицательного элементов массива
        System.out.println("Изменяем позицию минимального положительго и максимального отрицательного элементов в массиве");
        array[minusPosition] = minPlus;
        array[plusPosition] = maxMinus;
        for (int tests : array) {
            System.out.println(tests);
        }
    }
}