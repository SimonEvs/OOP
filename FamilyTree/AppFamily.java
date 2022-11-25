package FamilyTree;

import java.util.ArrayList;
import java.util.List;

public class AppFamily {
    List<Human> humans;

    public AppFamily(List<Human> list) {
        this.humans = humans;
    }

    public AppFamily() {
        this(new ArrayList<>());
    }

    public List<Human> getHumansList() {
        List<Human> res = new ArrayList<>();
        for (int i =0;i<humans.size();i++){
            if (humans.get(i).getHumanName()!=""){
                res.add(humans.get(i));
            }
        }
        return res;
    }

}
