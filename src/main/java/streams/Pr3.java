package streams;

import java.util.stream.Stream;

public class Pr3 {
    public static void main(String[] args) {
        Stream<Car> stream = Stream.of(new Car("Lada", 566667), new Car("Oka", 12000));
        stream
                //.filter(e -> e.getPrice()<137000)
                //.forEach(e -> System.out.println(e.getName()));
                //меняет тип данных

                //.filter(e -> e.getPrice()<137000)
                //.map(e -> e.getName())
        //.filter(e -> e.length() == 3)

               // .filter(e -> e.getPrice()<137000)
                //.flatMap(e -> Stream.of(
               // String.format(e.getName() + e.getPrice()),
                //String.format(e.getName() + (e.getPrice() - (int)e.getPrice()* 0.08))))
               //.forEach(e-> System.out.println(e));
                .filter(e-> e.getPrice()<1300000)
                .map(e->e.getName())
                .sorted()
                .forEach(e-> System.out.println(e));





    }
}
