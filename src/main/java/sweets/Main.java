package sweets;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //создаем коллекцию для хранения добавленных элементов
        ArrayList<Sweet> box = new ArrayList<>();
        // добавляем переменные для определения стоимости коробки, веса коробки и точку окончания
        double totalAmount = 0.00;
        double totalWeight = 0.00;
        boolean end = false;
        //добавляем сканнер для ввода значений с консоли
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер сладости что бы добавить ее в подарок:");
        System.out.println("1 - Конфеты шоколадные Маска");
        System.out.println("2 - Вафли Столичные сливочные");
        System.out.println("3 - Вафли Венские с вишней");
        System.out.println("4 - закончить формирование подарка");
//      запускаем цикл, который будем выполнятся пока не будет вызвана точка окончания
        while (!end) {
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    Candy candyRO = new Candy("Маска", 25.4, 5.95, "шоколадные");
                    box.add(candyRO);
                    totalAmount += candyRO.getAmount();
                    totalWeight += candyRO.getWeight();
                    System.out.println("Конфеты шоколадные Маска добавлены ");
                    break;
                case 2:
                    Waffle waffleS = new Waffle("Столичные", 40.25, 8.37, "сливочные");
                    box.add(waffleS);
                    totalAmount += waffleS.getAmount();
                    totalWeight += waffleS.getWeight();
                    System.out.println("Вафли Столичные сливочные добавлены");
                    break;
                case 3:
                    Waffle waffleV = new Waffle("Венские", 45.87, 12.25, "с вишней");
                    box.add(waffleV);
                    totalAmount += waffleV.getAmount();
                    totalWeight += waffleV.getWeight();
                    System.out.println("Вафли Венские с вишней добавлены");
                    break;
                case 4:
                    end = true;
                    break;
            }
        }
        //вывод в консоль состав подарка, общей стоимости и вес
        System.out.println("Подарок состоит из:");
        for (Sweet total : box) {
            System.out.println(total);
        }
        System.out.println("Общая стоимость подарка = " + totalAmount + ".");
        System.out.printf("Общий вес подарка = %.2f грамм.", totalWeight);
    }
}