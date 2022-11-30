package InterfaceTest3;

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

}
