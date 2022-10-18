package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Operation operation = new Operation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число Х (можно указать дробное число, разделитель - запятая)");
        double x = scanner.nextDouble();
        System.out.println("Введите число Y (можно указать дробное число, разделитель - запятая)");
        double y = scanner.nextDouble();
        System.out.println("Выберите операцию: +, -, *, /");
        String z = scanner.next();
        operation.setResult(x,y,z);
        System.out.println("Результат операции: " + operation.getResult());
        scanner.close();
    }
}