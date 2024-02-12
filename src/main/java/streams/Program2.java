package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Program2 {
    public static void main(String[] args) {
        /*ArrayList<String>  names = new ArrayList<>();
        Collections.addAll(names, "Yan", "Alla");
        names.stream()
                .filter(w -> w.length() ==3)
                .forEach(w-> System.out.println(w));  //терминальная операция */
        IntStream intStream = Arrays.stream(new int[]{45, 67, 78, 8});
        intStream.forEach(w -> System.out.println(w));
        System.out.println();
        DoubleStream doubleStream = Arrays.stream(new double[]{2, 22,2, 2, 22});
        doubleStream.forEach(d -> System.out.println(d));
        String[]  names = {"Yan", "Alla"};
        Stream<String> streamOfnames = Stream.of(names);
        streamOfnames.forEach(w -> System.out.println(w));

    }
}
