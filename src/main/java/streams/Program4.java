package streams;

import java.util.stream.Stream;

public class Program4 {
    public static void main(String[] args) {
        Stream<Car> stream = Stream.of(new Car("BMV", 4444444), new Car ("Nissan Juke", 450000));
        stream
                .sorted(new CarComporator())
                .forEach(e-> System.out.println(e));

    }
}
