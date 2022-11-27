package InterfaceTest2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        Radio rad=new Radio();
        Bird bird=new Bird();
        List<Speakable> list = new ArrayList<>();
        list.add(cat1);
        list.add(dog1);
        list.add(rad);
        list.add(bird);
        
        for (Speakable speakable : list) {

            speakable.speak();
        }
    }
}