package collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
public class MAp {
    public static void main(String[] args) {
        Map<Integer, String> animals = new HashMap<>();
        animals.put(0, "cat"); //добавляем в словарь ключ-значение
        animals.put(1, "lion");
        animals.put(2, "duck");
        System.out.println(animals.get(1)); //получаем элемент по ключу
        String elem = animals.get(1);
        System.out.println(elem);
        animals.remove(1);  //удаляем элемент
        //перебор элементов
        animals.get(1);

        Set<Integer> keys = animals.keySet();
        Collection <String> values = animals.values();
        animals.replace(1, "tiger"); //иеняем одно значение элемента на другое
        for (Map.Entry<Integer, String> item: animals.entrySet()){
            System.out.println(item.getKey() + item.getValue());
        }
        animals.clear(); //коллекция полностью очищается
        animals.put(2, "froggy");
        System.out.println(animals.containsKey(2)); //данный метод позволяет узнать, есть ли в данном словаре ключ с таким значением
        System.out.println(animals.containsValue("Volf")); //данный метод позволяет узнать, есть ли в данном словаре данное значение
        Map<Integer, String> names= new HashMap<>();
        names.put(0, "Liza"); //добавляем в словарь ключ-значение
        names.put(1, "Anna");
        names.put(2, "Yan");

        Map<Integer, String> colors = new HashMap<>();
        colors.put(0, "blue"); //добавляем в словарь ключ-значение
        colors.put(1, "pink");
        colors.put(2, "red");
        System.out.println(names.equals(colors)); //метод позволяет узнать, одинаковые ли коллекции
        System.out.println(colors.isEmpty()); //метод возвращает тру или фалс в зависимости от того, пуста коллекция или нет
        System.out.println(colors.size()); //возвращает количество элементовв в коллекции
    }
}
