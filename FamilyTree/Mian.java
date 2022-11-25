package FamilyTree;


    import java.util.ArrayList;
import java.util.List;
import FamilyTree.AppFamily ;
import FamilyTree.Family;
import FamilyTree.Human;


public class Mian {
    public static void main() {
        AppFamily newHuman=new AppFamily();
        
        // Bottle bottle=new Bottle("Sprite", 100, 2);
        // Product bottle2=new Bottle("Cola", 100, 0.5);
        // bottle.getVolume();
        List<Human> human =new ArrayList<>();
        human.add(new Human("Simon"));
        System.out.println(human.get(0));
    }

    
}
