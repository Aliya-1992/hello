package collections;

import java.util.HashSet;

public class ProgramSet {
    public static void main(String[] args) {
        HashSet<String> hashSet =new HashSet<>();
        System.out.println(hashSet);
        hashSet.add("monkey");
        hashSet.add("dog");
        hashSet.add("puppy"); //в можетстве не могут быть два одинаковых значения
        hashSet.remove("puppy");
    }
}
