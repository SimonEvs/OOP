package FamilyTree;

public class Сommunications {

    private Human human1;
    private Human human2;
    private TypeCommunications degreeKinship1;
    private TypeCommunications degreeKinship2;
    public void setH1(Human human1) {
        this.human1 = human1;
    }
    public void setH2(Human human2) {
        this.human2 = human2;
    }
    public void setDegreeKinship1(TypeCommunications degreeKinship1) {
        this.degreeKinship1 = degreeKinship1;
    }
    public void setDegreeKinship2(TypeCommunications degreeKinship2) {
        this.degreeKinship2 = degreeKinship2;
    }

    public Human getH1() {
        return human1;
    }

    public Human getH2() {
        return human2;
    }

    public TypeCommunications getDegreeKinship1() {
        return degreeKinship1;
    }

    public TypeCommunications getDegreeKinship2() {
        return degreeKinship2;
    }


    public Сommunications(Human human1, Human human2, TypeCommunications degreeKinship1, TypeCommunications degreeKinship2) {
        this.human1 = human1;
        this.human2 = human2;
        this.degreeKinship1 = degreeKinship1;
        this.degreeKinship2 = degreeKinship2;
    }
}