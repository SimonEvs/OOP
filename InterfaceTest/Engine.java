package InterfaceTest;

import java.util.Random;

public class Engine implements IEngine {
    @Override
    public int getEngineNumber() {
        Random r = new Random();
        int n = r.nextInt(1000, 3000);
        return n;
    }

    @Override
    public String getEngineName() {
        Random r = new Random();
        int n = r.nextInt(1, 3);
        if (n == 1) {
            return "ДВС";
        }
        else{return "Электродвигатель";}
    }
}