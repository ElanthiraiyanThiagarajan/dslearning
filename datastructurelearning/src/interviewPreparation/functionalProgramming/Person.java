package interviewPreparation.functionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class Person {

    public enum Sex {
        Male, Female, Transgender
    }

    int age;
    String name;
    Sex gender;
    String emailAddress;

    public Person() {
    }

    public Person(String name, int age, Sex gender, String emailAddress) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public void printPerson() {
        System.out.println(this.toString());
    }

    public static List<Person> generateDefaultList() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Shabbir", 20, Sex.Male, "shabbir@gmail.com"));
        people.add(new Person("Nikhil", 21, Sex.Male, "nikhil@gmail.com"));
        people.add(new Person("Shivam", 19, Sex.Male, "shivam@gmail.com"));
        return people;
    }

}
