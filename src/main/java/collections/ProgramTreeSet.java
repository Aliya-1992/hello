package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class ProgramTreeSet {
    public static void main(String[] args) {
        TreeSet<String>  treeSet = new TreeSet();
        treeSet.add("145");
        treeSet.add("2");
        SortedSet sortedSet = treeSet.subSet("145", "2");
        System.out.println(treeSet.higher("2"));
        System.out.println(treeSet.lower("2"));
    }
}
