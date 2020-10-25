package creational.builder;

import com.sun.tools.javac.util.List;

import java.time.LocalDate;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Test");

        Person.PersonBuilder builder = new Person.PersonBuilder("Anna Markowska",
                "a.markowska22",
                "Wojska Polskiego 2");

        builder.setBirthDate(LocalDate.of(2000,1,2));
        builder.setPhone(234234534);

        Person person = builder.getPerson();

       /* List.of(23,34,456,56).stream()
                .sorted()
                .distinct()
                .filter()
                .collect(Collectors.toList());
        String text = "hello";
        text.toUpperCase().substring(2).toLowerCase().length();*/


        System.out.println(person);


        //1. prywatny konstruktor obiektu
        //2. wewnetrzna klasa statyczna buildera



       /* Person person = new Person("Anna Markowska",
                "a.markowska22",
                "Wojska Polskiego 2");*/



        //wykonaj polecenie z ar


    }
}
