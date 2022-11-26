package InterfaceTest;

public class Car {
    private IEngine engine;
    public Car(IEngine engine100) {
        this.engine = engine100;
    }
    void getEngineInfo(){
        System.out.println(engine.getEngineName()+", № "+engine.getEngineNumber());
    }

}
