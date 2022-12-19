package icecreams.icecream;

public abstract class IcereamBuilder {
    private IceCream cream;

    void createIceCream(){
        cream = new IceCream();
    }

    abstract void buildName();
    abstract void buildSize();
    abstract void buildTaste();

    IceCream getCream() {
        return cream;
    }

    public IceCream build() {
        createIceCream();
        buildName();
        buildSize();
        buildTaste();
        return getCream();
    }
}
