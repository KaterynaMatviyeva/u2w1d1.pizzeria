package it.epicode.u2w1d1.pizzeria.config;

import it.epicode.u2w1d1.pizzeria.entity.Drink;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DrinkConfig {

    @Bean
    Drink getDrink (){
        Drink drink = new Drink();

        drink.setName("Coca-Cola");
        drink.setPrice(10);
        drink.setCalories(800);
        return drink;
    }
}
