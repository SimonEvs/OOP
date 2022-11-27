package HumanAndCommunication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();
        Human human4 = new Human();
        human1.addCommunication(human2, TypeComunication.Son);
        human1.addCommunication(human4, TypeComunication.GrandPa);
        human1.addCommunication(human3, TypeComunication.Son);
        human1.showCommunication(TypeComunication.Son);
        human1.showCommunication(TypeComunication.GrandPa);
    }

    

    public static void sort(List<String> list) {
        Collections.sort(list);
    }
}