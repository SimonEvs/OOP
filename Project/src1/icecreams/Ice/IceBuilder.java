package icecreams.Ice;

public abstract class IceBuilder {
    private Ice ice;

    void CreateIce(){
        ice=new Ice();
    }

    abstract void buildIceSize();
    abstract void buildIceColor();

    Ice getIce(){
        return ice;
    }
    public Ice buildIce(){
        CreateIce();
        buildIceSize();
        buildIceColor();
        return getIce();
    }

}
