package InterfaceTest;

public class Car {
    private IEngine engine;
    private IWheels wheels;
    public Car(IEngine engine100,IWheels wheel100) {
        this.engine = engine100;
        this.wheels=wheel100;
    }
    void getEngineInfo(){
        System.out.println(engine.getEngineName()+", № "+engine.getEngineNumber());
    }
    
    void getWheelInfo() {
        System.out.println(wheels.getWheels());
    }

    void getAllInfo(){
        System.out.println(engine.getEngineName()+", № "+engine.getEngineNumber()+" "+wheels.getWheels());
    }

}
