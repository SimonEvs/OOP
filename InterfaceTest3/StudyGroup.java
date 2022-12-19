package InterfaceTest3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup<T> implements Iterable<T> {
    private List<T> studentList;

    public StudyGroup() {
        studentList = new ArrayList<>();
    }

    public void addStudent(T student) {
        studentList.add(student);
    }

    @Override
    public Iterator<T> iterator() {return new StudyGroupIterator<T>(studentList);}

    public List<T> getStudentList() {return studentList;}
    // Вложенный класс
    // class StudyGroupIterator1 implements Iterator<Student>{

    // int index=0;

    // @Override
    // public boolean hasNext() {
    // return index<studentList.size();
    // }

    // @Override
    // public Student next() {
    // return studentList.get(index++);
    // }
    // }
}
