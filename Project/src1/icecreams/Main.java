package icecreams;

import icecreams.Ice.Ice;
import icecreams.Ice.IceBuilder;
import icecreams.Ice.SmallIceBulder;
import icecreams.icecream.IceCream;
import icecreams.icecream.IcereamBuilder;
import icecreams.icecream.SmallIceCream;

public class Main {
    public static void main(String[] args) {
        IcereamBuilder builder = new SmallIceCream();
        IceCream cream = builder.build();

        IceBuilder builder2= new SmallIceBulder();
        Ice ice =builder2.buildIce();

        System.out.println(cream);
        System.out.println(ice);
    }
}
