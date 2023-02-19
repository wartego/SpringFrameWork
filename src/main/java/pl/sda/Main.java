package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("my-beans.xml");
        System.out.println(context);


        Message message = (Message) context.getBean("myMessage", Message.class);
        System.out.println(message.getText());

        ExtraMessage extraMessage = context.getBean("myExtraMessage", ExtraMessage.class);
        System.out.println(extraMessage.getText());

        message.setText("zmiana tekstu");
        System.out.println(message.getText());

        Message myMessage = context.getBean("myMessage", Message.class);

        System.out.println(Arrays.toString(context.getBeanDefinitionNames())); // wypisuje wszystkie beany



    }
}