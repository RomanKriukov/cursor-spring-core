package org.example;

public class MessageSender {

    private MessageDecorator messageDecorator;

    public MessageSender(MessageDecorator messageDecorator) {
        this.messageDecorator = messageDecorator;
    }

    public  void send(String message, String author){
        System.out.println(messageDecorator.createMessage(message, author));
    }

}
