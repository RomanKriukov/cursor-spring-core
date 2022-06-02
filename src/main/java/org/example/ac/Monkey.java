package org.example.ac;


import org.springframework.beans.factory.annotation.Autowired;

public class Monkey {

    private String name;

    @Autowired
    private Bird bird;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
