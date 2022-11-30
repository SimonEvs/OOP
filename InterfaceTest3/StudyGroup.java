package InterfaceTest3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student>{
    private List<Student> studentList;

    public StudyGroup() {
        studentList = new ArrayList<>();
    }
    public void addStudent(Student student){
        studentList.add(student);
    }
    @Override
    public Iterator<Student> iterator(){
        return new StudyGroupIterator(studentList);
    }
    //Вложенный класс
    // class StudyGroupIterator1 implements Iterator<Student>{


    //     int index=0;

    //     @Override
    //     public boolean hasNext() {
    //         return index<studentList.size();
    //     }

    //     @Override
    //     public Student next() {
    //         return studentList.get(index++);
    //     }
    // }
}
