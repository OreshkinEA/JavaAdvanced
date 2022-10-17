package sweets;

//добавляем класс-наследник от Sweet
public class Waffle extends Sweet {
    private String supplements;

    //определяем конструктор с новой переменной
    public Waffle(String name, Double weight, Double amount, String supplements) {
        super(name, weight, amount);
        this.supplements = supplements;
    }

    //добавляем геттеры и сеттеры для новой переменной
    public String getSupplements() {
        return this.supplements;
    }

    public void setSupplements(String supplements) {
        this.supplements = supplements;
    }

    // переопределяем метод toString
    @Override
    public String toString() {
        return "Вафли "+ super.toString() + ", Начинка " + supplements;
    }
}
