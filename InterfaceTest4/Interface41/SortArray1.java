package Interface41;

import java.util.ArrayList;
import java.util.Collections;

public class SortArray1 {

    public ArrayList<Integer> arr=new ArrayList<>();

    
    public ArrayList<Integer> getArr() {
        return arr;
    }
    
    public void setArr(ArrayList<Integer> arr) {
        this.arr = arr;
    }
    public void sortBy() {
        arr.sort(new ArraysComporator());
    }
}
