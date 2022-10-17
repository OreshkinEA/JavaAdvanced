import java.util.Scanner;

/**
 * @author Oreshkin E.
 * @see #main(String[])
 */

public class Calculator {
    public static void main(String[] args) {
       /*
       - Реализовать сложение дробных чисел, которые пользователь вводит в консоль.

- Использовать комментарии и JavaDoc при описании метода.

- Использовать форматирование при выводе результата в консоль.

Полученный результат округлять до 4-х знаков после запятой.

Запушить проект в свой репозиторий на GitHub и прикрепить ссылку на него в ответе на задание

* Доп задание по желание: добавить возможность выбора другой операции (сложение, вычитание, деление, умножение)
        */

        double result = 0;
        //ввод первого числа для операций
        System.out.println("Введите дробное число X (разделителем является запятая):");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        // ввод второго числа для операций
        System.out.println("Введите дробное число Y (разделителем является запятая):");
        double y = scanner.nextDouble();
        // выбор типа операции
        System.out.println("Выберите операцию: +, -, *, /");
        String operator = scanner.next();
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
}