import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ArrayAndCalculator {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите задание: 1 - калькулятор, 2 - поиск слова в массиве");
        int decision = scanner.nextInt();
        //Выбор задания
        switch (decision) {
            case (1): {
                double result = 0;
                //ввод первого числа для операций
                System.out.println("Введите дробное число X (разделителем является запятая):");
                Scanner number = new Scanner(System.in);
                double x = number.nextDouble();
                // ввод второго числа для операций
                System.out.println("Введите дробное число Y (разделителем является запятая):");
                double y = number.nextDouble();
                // выбор типа операции
                System.out.println("Выберите операцию: +, -, *, /");
                String operator = number.next();
                // действия в зависимости от операции
                switch (operator) {
                    case ("+"):
                        result = x + y;
                        break;
                    case ("-"):
                        result = x - y;
                        break;
                    case ("*"):
                        result = x * y;
                        break;
                    case ("/"):
                        result = x / y;
                        break;
                }
                // вывод результата с форматированием до 4-ех символов после запятой
                System.out.printf("Результат операции: %.4f", result);
                scanner.close();
            }
            case (2):
                int count = 0;
                String maxString = "";
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Введите количество слов:");
                // задаем массив слов
                // размерность массива произвольна, задается в консоли
                String size = reader.readLine();
                String [] array = new String[Integer.parseInt(size)];
                System.out.println("Введите строки:");
                // ввод слов в количестве равном заданной длине массива
                for (int i = 0; i < Integer.parseInt(size); i++) {
                    array[i] = reader.readLine();
                }
                // поиск самого длинного слова в массиве
                for (int i = 0; i < Integer.parseInt(size); i++) {
                    if (array[i].chars().count() > count) {
                        count = (int) array[i].chars().count();
                        maxString = array[i];
                    }
                }
                // вывод результата на консоль
                System.out.println("Самое длинное слово: "+ maxString);
        }
    }
}