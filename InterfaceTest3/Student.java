package InterfaceTest3;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student student) {
        //можно через иф,но
        return name.compareTo(student.getName());
    }
}
