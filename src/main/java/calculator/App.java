package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        WorkOperation operation = new WorkOperation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число Х");
        int x = scanner.nextInt();
        System.out.println("Введите число Y");
        int y = scanner.nextInt();
        System.out.println("Выберите операцию: +, -, *, /");
        String work = scanner.next();
        switch (work) {
            case ("+"):
                operation.setSum(x,y);
                System.out.println("Результат операции: " + operation.getSum());
                break;
            case ("-"):
                operation.setSub(x,y);
                System.out.println("Результат операции: " + operation.getSub());
                break;
            case ("*"):
                operation.setMul(x,y);
                System.out.println("Результат операции: " + operation.getMul());
                break;
            case ("/"):
                operation.setDiv(x,y);
                System.out.println("Результат операции: " + operation.getDiv());
                break;
            default:
                System.err.println("Операция не выбрана");
        }
        scanner.close();
    }
}