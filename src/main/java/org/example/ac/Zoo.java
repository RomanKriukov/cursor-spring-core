package org.example.ac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Zoo {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("org/example/ac");
        Bird bird = (Bird) context.getBean("bird");
        Tiger tiger = context.getBean("tiger", Tiger.class);
        Monkey monkey = context.getBean("monkey", Monkey.class);

        System.out.println("bird [" + bird.getName() + "] with monkey [" + bird.getMonkey().getName() + "]");
        System.out.println("tiger [" + tiger.getName() + "] with monkey [" + tiger.getMonkey().getName() + "]");
        System.out.println("monkey [" + monkey.getName() + "]");

    }
}
