package VendingMachine1.src.model;

import VendingMachine1.src.model.Product;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    List<Product> products;

    public VendingMachine(List<Product> list){
        this.products=products;
    }

    public VendingMachine(){
        this(new ArrayList<>());
    }
    public List<Product> getProductByCost(){
        List<Product> res=new ArrayList<>();
        for (int i =0;i<products.size();i++){
            if (products.get(i).getCost()<=cost){
                res.add(products.get(i));
            }
        }
        return res;
    }
}
