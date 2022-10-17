package sweets;

// создаем абстрактный класс
public abstract class Sweet {
    private String name;
    private Double weight;
    private Double amount;

    //определяем конструктор
    public Sweet(String name, Double weight, Double amount) {
        this.name = name;
        this.weight = weight;
        this.amount = amount;
    }
// добавляем геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    //переопределяем метод toString
    @Override
    public String toString() {
        return name + ", Вес = " + weight + ", Стоимость = " + amount;
    }
}
