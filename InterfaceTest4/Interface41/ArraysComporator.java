package Interface41;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

public class ArraysComporator implements Comparable<ArrayList> {  
    int index;
    @Override
    public int compareTo(ArrayList o) {
        if (o.get(index)==o.get(o.size()-1)){
            
            return (int) o.get(index);
        }
        return 0;
    }
}
