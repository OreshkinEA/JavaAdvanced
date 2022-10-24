package calculator;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        String x = "";
        String y = "";
        String str = "";
        Operation operation = new Operation();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число Х (можно указать дробное число, разделитель - точка/запятая)");
        do {
            str = reader.readLine();
            str = str.replaceAll("[,]", ".");
            str = str.replaceAll("[^\\d.]", "");
            str = str.replaceAll("(.)\\1+", ".");
            if (str.startsWith("."))  {
                System.out.println("Неправильно! Введите число Х (можно указать дробное число, разделитель - точка/запятая)");
            } else if (str == null || str.isEmpty()) {
                System.out.println("Неправильно! Введите число Х (можно указать дробное число, разделитель - точка/запятая)");
            }
        } while (str.startsWith(".") || (str == null || str.isEmpty()));
        try {
            x = String.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException e) {
        }
        operation.setX(x);
        System.out.println("Введите число Y (можно указать дробное число, разделитель - точка/запятая)");
        do {
            str = reader.readLine();
            str = str.replaceAll("[,]", ".");
            str = str.replaceAll("[^\\d.]", "");
            str = str.replaceAll("(.)\\1+", ".");
            if (str.startsWith(".")) {
                System.out.println("Неправильно! Введите число Y (можно указать дробное число, разделитель - точка/запятая)");
            } else if (str == null || str.isEmpty()) {
                System.out.println("Неправильно! Введите число Y (можно указать дробное число, разделитель - точка/запятая)");
            }
        } while (str.startsWith(".") || (str == null || str.isEmpty()));
        try {
            y = String.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException e) {
        }
        operation.setY(y);
        System.out.println("Выберите операцию: +, -, *, /");
        do {
            str = reader.readLine();
            str = str.replaceAll("[\\w.]", "");
            if ((str.matches("^[^[+][-][*][/]]+\\Z")) | (str.length() > 1)) {
                System.out.println("Неправильно! Выберите операцию: +, -, *, /)");
            } else if (str == null || str.isEmpty()) {
                System.out.println("Неправильно! Выберите операцию: +, -, *, /)");
            }
        } while ((str.startsWith(".") | (str.matches("^[^[+][-][*][/]]+\\Z")) | str.length() > 1) || (str == null || str.isEmpty()));
        operation.setZ(str);
        try {
            operation.setResult(x, y);
        } catch (NumberFormatException e) {
        }
        System.out.printf("Результат операции: " + operation.getResult());
        reader.close();
    }
}