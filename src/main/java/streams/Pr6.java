package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Pr6 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Collections.addAll(names, "Ulya", "Anna", "Masha");
        Stream<ArrayList<String>> stream = Stream.of(names);
        stream.
                forEach(e-> System.out.println(e));


        
    }
}
