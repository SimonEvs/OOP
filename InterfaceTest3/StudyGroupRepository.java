package InterfaceTest3;

import java.util.Collection;
import java.util.Collections;

public class StudyGroupRepository {

    private StudyGroup group;
    private static int id;

    public StudyGroupRepository(StudyGroup group) {
        id = 0;
        this.group = group;
    }

    public void addStudent(String name){
        Student student=new Student(id++, name);
        group.addStudent(student);
    }

    // public void sort(){
    //     Collections.sort(group.getStudentList());
    // }

    public void sortByName(){
        // Collections.sort(group.getStudentList(),new StudentComparatorByName());
        group.getStudentList().sort(new StudentComparatorByName());
    }

    public void sortByID(){
        Collections.sort(group.getStudentList(),new StudentComparatorByID());
    }
}
