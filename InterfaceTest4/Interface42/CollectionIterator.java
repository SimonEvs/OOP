package InterfaceTest4.Interface42;

import java.util.Iterator;
import java.util.List;

public class CollectionIterator implements Iterator<Temp> {
    private int index;
    List<Temp> collectionList;

    public void Collectionterator(List<Temp> collectionList) {
        this.collectionList = collectionList;
    }

    @Override
    public boolean hasNext() {
        return index < collectionList.size();
    }

    @Override
    public Temp next() {
        return collectionList.get(index++);
    }

    public int getIndex() {
        return index;
    }

}
