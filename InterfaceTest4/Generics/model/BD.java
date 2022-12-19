package Generics.model;

import java.util.List;

public interface BD {
    List<Person> getList();
    int createPersonRow(Person person);
}