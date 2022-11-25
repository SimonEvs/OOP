package FamilyTree;

public class Human extends Family{
    private String name;
    // private String sonName;
    // private String motherName;


    public Human(String name){
        this.name=name;
    }

    public String getHumanName() {
        return name;
    }

    public void setHumanName(String name) {
        this.name = name;
    }
    public void addDoughter(String daughterName) {
        this.name = daughterName;
    }
    
}
