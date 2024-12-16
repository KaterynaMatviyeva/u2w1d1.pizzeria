package it.epicode.u2w1d1.pizzeria.runner;

import it.epicode.u2w1d1.pizzeria.entity.Drink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DrinksRunner implements ApplicationRunner {

    @Autowired
    Drink drink;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(drink);

    }
}
