package AdvanceJavaFeatures.Collections.StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 25));
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 20));
        people.add(new Person("Emily", 35));

        // Sorting the list based on age using a custom comparator
        Comparator<Person> ageComparator = Comparator.comparingInt(Person::getAge);
        List<Person> sortedList = people.stream()
                .sorted(ageComparator)
                .toList();

        // Filtering and process elements in the sorted list
        List<String> filteredNames = sortedList.stream()
                .filter(person -> person.getAge() < 30)
                .map(Person::getName)
                .toList();

        System.out.println("Filtered names: " + filteredNames);
    }
}
