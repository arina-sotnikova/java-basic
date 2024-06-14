package ru.otus.java.home.homework10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PhoneBook {
    private HashMap<Person, Set<String>> records;

    public PhoneBook(HashMap<Person, Set<String>> records) {
        this.records = records;
    }

    public Set<String> getNumbers(Person person) {
        return records.get(person);
    }

    public void add(Person person, String number) {
        Set<String> personNumbers = records.getOrDefault(person, new HashSet<String>());
        personNumbers.add(number);
        records.put(person, personNumbers);
    }

    public Map<Person, Set<String>> find(String lastName) {
        return records.entrySet()
                .stream()
                .filter(e -> e.getKey().lastName.equals(lastName))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public boolean containsPhoneNumber(String number) {
        return records.entrySet().stream().anyMatch(e -> e.getValue().contains(number));
    }
}
