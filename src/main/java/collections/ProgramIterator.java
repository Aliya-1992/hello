package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ProgramIterator {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Anna");
        arrayList.add("Nina");
        arrayList.add("Ella");
        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        ListIterator <String> listIterator = arrayList.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println(listIterator.previous());
        listIterator.remove();
        listIterator.hasPrevious();
        listIterator.set("Nina");
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }

}
