package org.example;

public class MessageSender2 {

    private MessageDecorator messageDecorator;

    public MessageSender2(MessageDecorator messageDecorator) {
        this.messageDecorator = messageDecorator;
    }

    public  void send(String message, String author){
        System.out.println(messageDecorator.createMessage("yuyuyuy: " + message, author));
    }
}
