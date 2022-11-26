package InterfaceTest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        IWheels wheels= new Wheels();
        IEngine engine = new Engine();
        IEngine airengine = new Engine();
        Car car = new Car(engine,wheels);
        Car airplane =new Car(airengine,wheels);
        car.getEngineInfo();
        airplane.getEngineInfo();
        airplane.getWheelInfo();
        System.out.println("");
        airplane.getAllInfo();
    
    }
}
