package streams;

import java.util.Comparator;

public class CarComporator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) { //нам будут приходить объекты. мы будем сравнивать объекты. в качетве ответа будет выводиться результат сравнения. в данном случае сравниваем по имени.
        return car1.getName().toLowerCase().compareTo(car2.getName().toLowerCase());
    }
}
