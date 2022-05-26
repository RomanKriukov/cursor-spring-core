package org.example;

public class MessageDecorator {

    public String createMessage(String text, String author){
        return text + " (c)" + author;
    }
}
