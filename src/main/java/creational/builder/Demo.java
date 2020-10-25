package creational.builder;

import java.time.LocalDate;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Test");

        Person person = Person.buildCustomPerson("Anna Markowska",
                "a.markowska22",
                "Wojska Polskiego 2")
                .bornIn(LocalDate.of(2000, 1, 2))
                .withPhone(234234534)
                .build();








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
