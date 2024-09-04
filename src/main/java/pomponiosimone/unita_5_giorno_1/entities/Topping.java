package pomponiosimone.unita_5_giorno_1.entities;

public class Topping extends Menu{
    public Topping(String name, int calories, double price) {
        super (name,calories,price);
    }

    @Override
    public String toString() {
        return "Topping{" +
                "calories=" + calories +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
