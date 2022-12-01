package InterfaceTest4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(1);
        array1.add(3);
        array1.add(5);
        array1.add(3);
        array1.add(7);
        array1.add(3);

        array1.sortBy();
        for (int number:array1) {
            System.out.println(number);

        }

    }
}

