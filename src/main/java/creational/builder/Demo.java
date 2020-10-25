package creational.builder;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Test");

        Person.PersonBuilder builder = new Person.PersonBuilder("Anna Markowska",
                "a.markowska22",
                "Wojska Polskiego 2");
        Person person = builder.getPerson();

        System.out.println(person);


        //1. prywatny konstruktor obiektu
        //2. wewnetrzna klasa statyczna buildera



       /* Person person = new Person("Anna Markowska",
                "a.markowska22",
                "Wojska Polskiego 2");*/



        //wykonaj polecenie z ar


    }
}
