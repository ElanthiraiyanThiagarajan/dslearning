package interviewPreparation.functionalProgramming;

import java.util.List;
import java.util.function.Predicate;

public class Main {

    interface CheckPerson {
        boolean test(Person p);
    }

    static class CheckPersonImplementation implements CheckPerson {

        @Override
        public boolean test(Person p) {
            return p.gender == Person.Sex.Male && p.getAge() >= 21 && p.getAge() <= 25;
        }
    }

    public static void printPersonOlderThan(List<Person> personList, int age) {
        for (var person : personList) {
            if (person.getAge() >= age) {
                person.printPerson();
            }
        }
    }

    public static void printPersonWithAgeRange(List<Person> personList, int low,int high) {
        for (var person : personList) {
            if (low<=person.getAge() && person.getAge() <= high) {
                person.printPerson();
            }
        }
    }

    public static void printPeople(List<Person> personList,CheckPerson p){
        for(var person:personList){
            if(p.test(person)){
                person.printPerson();
            }
        }
    }
    public static void printPeopleWithPredicate(List<Person> personList, Predicate<Person> p){
        for(var person:personList){
            if(p.test(person)){
                person.printPerson();
            }
        }
    }


    public static void main(String[] args) {
        List<Person> personList = Person.generateDefaultList();
//        printPersonOlderThan(personList,20);
//        printPersonWithAgeRange(personList,20,21);
//          printPeople(personList,new CheckPersonImplementation() );
//          printPeople(personList,new CheckPerson(){
//              @Override
//              public boolean test(Person p) {
//                  return  p.gender == Person.Sex.Male && p.getAge() >= 18 && p.getAge() <= 25;
//              }
//          } );

//        printPeople(personList,p ->  p.gender == Person.Sex.Male && p.getAge() >= 18 && p.getAge() <= 25);
        printPeopleWithPredicate(personList,p ->  p.gender == Person.Sex.Male && p.getAge() >= 20 && p.getAge() <= 25);

    }
}
