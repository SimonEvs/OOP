package InterfaceTest4.Interface42;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection1 implements Iterable<Temp>{
        private List<Temp> collectionList;
    
        public Collection1() {
            collectionList = new ArrayList<>();
        }
        public void addStudent(Temp temp){
            collectionList.add(temp);
        }
        @Override
        public Iterator<Temp> iterator() {
            return new CollectionIterator(collectionList);
            
        }
}
