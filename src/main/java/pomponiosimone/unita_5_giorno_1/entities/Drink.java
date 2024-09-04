package pomponiosimone.unita_5_giorno_1.entities;

public class Drink extends Menu{
    public Drink(String name, int calories, double price) {
        super (name,calories,price);
    }
    @Override
    public String toString() {
        return "Drink{" +
                "calories=" + calories +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
