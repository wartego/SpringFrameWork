package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("my-beans.xml");
        System.out.println(context);


        Message message = (Message) context.getBean("myMessage", Message.class);
        System.out.println(message.getText());

        ExtraMessage extraMessage = context.getBean("myExtraMessage", ExtraMessage.class);
        System.out.println(extraMessage.getText());

        Message myMessage = context.getBean("myMessage", Message.class);

        System.out.println(Arrays.toString(context.getBeanDefinitionNames())); // wypisuje wszystkie beany

        message.setText("zmiana tekstu");
        Message message1 = context.getBean("myMessage", Message.class);
        System.out.println(message1.getText());


        //prototype
        Message myMessage3 = context.getBean("myMessage3", Message.class);
        myMessage3.setText("nowy");
        Message myMessage4 = context.getBean("myMessage3", Message.class);
        System.out.println(myMessage4.getText());

        Book book =context.getBean("Potop", Book.class);
        System.out.println(book.getName() + " -> " +book.getAuthor());

        Person person = context.getBean(Person.class);
        System.out.println(person.getAddress().getCity());

        List myListInteger = context.getBean("myListInteger", List.class);
        System.out.println(myListInteger);

        List myListString = context.getBean("myListString", List.class);
        System.out.println(myListString);

        System.out.println(context.getBean("myDate", Date.class));

    }
}