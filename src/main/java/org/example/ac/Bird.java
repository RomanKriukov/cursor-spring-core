package org.example.ac;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Bird implements InitializingBean {

    private Monkey monkey;
    private String name;

    @Autowired
    public Bird(final Monkey monkey) {
        System.out.println("Hello from Constructor!");
    }

    @PostConstruct
    public  void init(){
        System.out.println("Hello from init()!");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Hello from afterPropertiesSet()!");
    }

    @PreDestroy
    public void destroy(){
        this.monkey = monkey;
        System.out.println("Hello from destroy()!");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Monkey getMonkey() {
        return monkey;
    }

    public void setMonkey(Monkey monkey) {
        this.monkey = monkey;
    }
}
