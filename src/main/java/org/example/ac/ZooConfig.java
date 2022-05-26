package org.example.ac;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ZooConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Monkey monkey(){
        Monkey monkey = new Monkey();
        monkey.setName("Monkey " + Math.random());
        return monkey;
    }

    @Bean
    public Bird bird(){
        Bird bird = new Bird(monkey());
        bird.setName("Oscar-2");
        bird.setMonkey(monkey());
       return bird;
    }

    @Bean
    public Tiger tiger(){
        Tiger tiger = new Tiger();
        tiger.setName("Leo");
        tiger.setMonkey(monkey());
        return tiger;
    }
}
