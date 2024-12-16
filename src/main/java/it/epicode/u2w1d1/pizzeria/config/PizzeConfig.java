package it.epicode.u2w1d1.pizzeria.config;

import it.epicode.u2w1d1.pizzeria.entity.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PizzeConfig {

    @Bean
    Pizza getPizza(){
        Pizza pizza = new Pizza();
        pizza.setName("Margherita");
        pizza.setPrice(5);
        return pizza;
    }
}
