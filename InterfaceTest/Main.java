package InterfaceTest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        IEngine engine = new Engine();
        Car car = new Car(engine);
        
        car.getEngineInfo();


    
    }
}
