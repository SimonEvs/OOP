package FamilyTree;


import java.util.ArrayList;
import java.util.List;
import FamilyTree.Human;

public class Main {
    public static void main(String[] args) {

        FamilyTree tree = new FamilyTree();

        Human h1 = new Human("Виталий", 25, Gender.мужской);
        tree.setTreeHuman(h1);
        Human h2 = new Human("Дмитрий", 5, Gender.мужской);
        tree.setTreeHuman(h2);
        Human h3 = new Human("Жанна", 4, Gender.женский);
        tree.setTreeHuman(h3);
        Human h4 = new Human("Екатерина", 4,Gender.женский);
        tree.setTreeHuman(h4);

        h1.addСommunications(h2, TypeCommunications.отец, TypeCommunications.ребенок);
        h1.addСommunications(h3, TypeCommunications.отец, TypeCommunications.ребенок);
        h1.addСommunications(h4, TypeCommunications.отец, TypeCommunications.ребенок);

        h1.getInfo();
        h2.getInfo();
        h3.getInfo();
        //System.out.println(FamilyTree.getId());
        tree.getInfo();

    }
}