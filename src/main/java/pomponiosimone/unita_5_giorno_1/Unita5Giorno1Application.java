package pomponiosimone.unita_5_giorno_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pomponiosimone.unita_5_giorno_1.MenuConfig;
import pomponiosimone.unita_5_giorno_1.entities.Drink;
import pomponiosimone.unita_5_giorno_1.entities.Pizza;
import pomponiosimone.unita_5_giorno_1.entities.Topping;

import java.util.List;

@SpringBootApplication
public class Unita5Giorno1Application {

	public static void main(String[] args) {

		SpringApplication.run(Unita5Giorno1Application.class, args);


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MenuConfig.class);
        System.out.println("-------------------Menù Pizza-----------------" );

		List<Pizza> menuPizza = context.getBean("Menupizza", List.class);
		menuPizza.forEach(System.out::println);
		System.out.println("-------------------Menù Drink-----------------");
		List<Drink> menuDrink = context.getBean("Menudrink", List.class);
		menuDrink.forEach(System.out::println);
		System.out.println("-------------------Menù Topping-----------------");
		List<Topping> menuTopping = context.getBean("Menutopping", List.class);
		menuTopping.forEach(System.out::println);





		context.close();
	}
}