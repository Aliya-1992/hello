package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;
import java.util.Optional;

public class Pr8 {
    public static void main(String[] args) {
        /* Stream <Integer>stream = Stream.of(1, 67, 78, 8999);
       stream
                .skip(2) //метод позволяет пропустить 2 первых элемента
                .limit(10) //будет использовано определенное количество из потока

                .forEach(e-> System.out.println(e));*/
        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 1, 23, 56, 677, 77,66,677, 786,55);
        /*System.out.println(arrayList.stream()
                .skip(1)
                .filter(e->e>10)
                //.limit(3)
               // .sorted()
                //.forEach(e-> System.out.println(e));
                .count());*/
       // long r = arrayList.stream()
             //   .skip(1)
              //  .count();
       // System.out.println(r);

        //Optional <Integer> optional = arrayList.stream().findFirst();
       // long t = optional.get();
       // System.out.println(t);

        System.out.println(arrayList.stream ()
                .anyMatch(e->e>10)); //возвращает тру, если хоть одно число ссооответствует условию
        System.out.println(arrayList.stream ()
                .allMatch(e->e>10));//возвращает тру, если dct ссооответствует условию


    }
}
