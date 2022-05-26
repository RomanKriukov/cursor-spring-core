package org.example;

public class Application {
    public static void main(String[] args) {
        MessageDecorator messageDecorator = new MessageDecorator();
        MessageSender sender = new MessageSender(messageDecorator);
        MessageSender2 sender2 = new MessageSender2(messageDecorator);
        sender.send("My Message", "My Author");
        sender2.send("My Message", "My Author");
    }
}
