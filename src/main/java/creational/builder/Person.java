package creational.builder;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

    private String fullName;
    private String mail;
    private String address;

    private LocalDate birthDate;
    private int phone;

    private Person(String fullName, String mail, String address) {
        this.fullName = fullName;
        this.mail = mail;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return fullName.equals(person.fullName) &&
                mail.equals(person.mail) &&
                address.equals(person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, mail, address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", birthDate=" + birthDate +
                ", tel=" + phone +
                ", mail='" + mail + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


    static class PersonBuilder{
        private Person person;

        public PersonBuilder(String fullName, String mail, String address){
            person = new Person(fullName,mail,address);
        }


        public Person getPerson() {
            return person;
        }

        public void setBirthDate(LocalDate birthDate){
            person.birthDate = birthDate;
        }

        public void setPhone(int phone){
            person.phone = phone;
        }


    }

}


