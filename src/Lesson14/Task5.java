package Lesson14;

import java.util.ArrayList;
import java.util.Comparator;

public class Task5{

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Qwer", "Poiuy", 20));
        list.add(new Person("Qwertyuiopasdtf", "Hfg", 97));
        list.add(new Person("Dghjk", "Jgd", 50));
        list.add(new Person("Zdsafasfasdfx", "adfghjkl", 51));

        list
                .stream()
                .filter((p) -> p.getFirstName().length() + p.getLastName().length() <= 15)
                .max((p1, p2) -> Integer.compare( p1.getAge(), p2.getAge()))
                .ifPresent(person -> System.out.println(person.getFirstName() + " " + person.getLastName()));
    }
}
