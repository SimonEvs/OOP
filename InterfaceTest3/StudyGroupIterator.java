package InterfaceTest3;

import java.util.Iterator;
import java.util.List;

public class StudyGroupIterator implements Iterator<Student> {
    private int index;
    List<Student> studentList;
   
    public StudyGroupIterator(List<Student> studentList) {
        this.studentList = studentList;
    }
 

    @Override
    public boolean hasNext() {
        return index < studentList.size();
    }

    @Override
    public Student next() {
        return studentList.get(index++);
    }


    public int getIndex() {
        return index;
    }


}
