package InterfaceTest3;

import java.util.Comparator;

//comparator сравнивает двух, кто больше.
public class StudentComparatorByName implements Comparator<Student> {
    @Override
    public int compare(Student student,Student t1){
        return student.getName().compareTo(t1.getName());
    }
}
