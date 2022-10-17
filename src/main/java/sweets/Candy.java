package sweets;

//создаем класс-наследник от Sweet
public class Candy extends Sweet {
    private String type;

    //определяем конструктор с новой переменной
    public Candy(String name, Double weight, Double amount, String type) {
        super(name, weight, amount);
        this.type = type;
    }

    //добавляем геттеры и сеттеры для новой переменной
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // переопределяем метод toString
    @Override
    public String toString() {
        return "Конфета " + super.toString() + ", тип = " + type;
    }
}