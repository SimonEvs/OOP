package icecreams.icecream;

public class IceCream {
    private String name;
    private int size;
    private String taste;

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getSize() {return size;}

    public void setSize(int size) {this.size = size;}

    public String getTaste() {return taste;}

    public void setTaste(String taste) {this.taste = taste;}
   
   @Override
   public String toString() {
        return "Мороженое {" +
        "Название='" + name + '\'' +
        "; Размер=" +size +
        "; вкус=" + taste +
        '}';
   }

}
