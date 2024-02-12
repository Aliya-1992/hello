package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

public class Program10 {
    public static void main(String[] args) {
        ArrayList<Car> arrayList = new ArrayList<>();
       // Collections.addAll(arrayList, new Car("BMV", 4444444), new Car ("Nissan Juke", 450000));
        Optional<Car> min =arrayList.stream().min(Car::compare);
       // min.ifPresent(e-> System.out.println(e.getName()));

        min.ifPresentOrElse(e-> System.out.println(e), ()-> System.out.println("список пуст"));
    }
}
