package InterfaceTest4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

public class ArraysComporator implements Comparable<ArrayList> {
    
    @Override
    public int compareTo(Array arr) {
        
        return arr.get(arr,arr.getLength(arr));
    }

    
    
}
