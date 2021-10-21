package seedu.address.model.sorter;

import seedu.address.model.person.Person;

import java.util.Comparator;

public class EmailComparator implements Comparator<Person> {
    private final String comparator = "email";

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getEmail().value.compareTo(p2.getEmail().value);
    }

    @Override
    public String toString() {
        return this.comparator;
    }
}
