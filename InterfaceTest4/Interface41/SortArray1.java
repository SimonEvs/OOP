package Interface41;

import java.util.ArrayList;
import java.util.Collections;

public class SortArray1 {

    private ArrayList<Integer> arr=new ArrayList<>();

    
    public ArrayList<Integer> getArr() {
        return arr;
    }
    
    public void setArr(ArrayList<Integer> arr) {
        this.arr = arr;
    }
    public void sortBy() {
        //Collections.sort(arr.get(index),new ArraysComporator());
        arr.getArr().sort(new ArraysComporator());
    }
}
