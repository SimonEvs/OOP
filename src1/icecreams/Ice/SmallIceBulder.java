package icecreams.Ice;

public class SmallIceBulder extends IceBuilder {
    @Override
    void buildIceColor() {
       getIce().setColor("Зеленый");
    }
    @Override
    void buildIceSize() {
        getIce().setSize(1);
    }
}
