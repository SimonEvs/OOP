package InterfaceTest3;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        StudyGroup<Student> group = new StudyGroup<>();
        StudyGroupRepository repository = new StudyGroupRepository(group);

        repository.addStudent("Петя");
        repository.addStudent("Вася");
        repository.addStudent("Коля");
        repository.addStudent("Максим");

        // repository.sort();


        repository.sortByID();
        // repository.sortByName();

        for (Student student : group) {
            System.out.println(student);

        }
    }
}
