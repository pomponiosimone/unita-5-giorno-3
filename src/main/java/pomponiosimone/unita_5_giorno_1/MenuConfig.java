package pomponiosimone.unita_5_giorno_1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pomponiosimone.unita_5_giorno_1.entities.Drink;
import pomponiosimone.unita_5_giorno_1.entities.Pizza;
import pomponiosimone.unita_5_giorno_1.entities.Topping;

import java.util.List;

@Configuration
public class MenuConfig {

    //Beans
    @Value("${costo.del.coperto:2.50}")
    private double costoDelCoperto;

    @Bean
    public List<Pizza> Menupizza() {
       return List.of(
               new Pizza("Margherita", 60, 6.5),
        new Pizza("Diavola", 90, 10),
        new Pizza("Napoli", 70, 9),
        new Pizza("Capricciosa", 100, 9)
       );
    }
   @Bean
    public List<Drink> Menudrink() {
        return List.of(
                new Drink("Spritz", 100, 8.5),
                new Drink("Coca cola", 90, 2),
                new Drink("Pina Colada", 70, 8),
                new Drink("Acqua", 0, 1.5)
        );
    }
    @Bean
    public List<Topping> Menutopping() {
        return List.of(
                new Topping("Olive", 10, 1.5),
                new Topping("Mozzarella", 20, 1.7),
                new Topping("Salame", 10, 1.2),
                new Topping("patatine fritte", 10, 2.5)
        );
    }


}
