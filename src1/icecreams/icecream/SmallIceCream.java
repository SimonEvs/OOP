package icecreams.icecream;

public class SmallIceCream extends IcereamBuilder {
    

    @Override
    void buildName() {
        getCream().setName("Маленькое мороженое");
    }

    @Override
    void buildTaste() {
        getCream().setTaste("Клубника");
    }

    @Override
    void buildSize() {
        getCream().setSize(2);
    }

}

