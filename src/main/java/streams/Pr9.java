package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Pr9 {
    public static void main(String[] args) {
        ArrayList<Car> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, new Car("BMV", 4444444), new Car ("Nissan Juke", 450000));
        Car min = arrayList.stream().min(Car::compare).get();
        Car max = arrayList.stream().max(Car::compare).get();
        System.out.println(min.getName() + " "+min.getPrice());
        System.out.println(max.getName()+" "+max.getPrice());
    }
}
