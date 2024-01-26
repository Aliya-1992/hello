package collections;

import java.util.*;

public class ProgramSortedMap {
    public static void main(String[] args) {
        SortedMap sortedMap = new TreeMap();

        TreeMap<Integer, String> animals = new TreeMap<>();
        animals.put(0, "lion");
        animals.put(1, "tiger");
        animals.put(2, "cat");
        Set<Integer> keys = animals.keySet();
        Collection<String> values = animals.values();
        Map<Integer, String> afterElem = animals.tailMap(1); //Данный метод позвлоляет создать новый словь, который отсчитывает элементы с указанного
        System.out.println(afterElem);
        Map<Integer, String> beforeElem = animals.headMap(1); //возвращает значения, ключи которого меньше указанного
        System.out.println(beforeElem);
        Map.Entry<Integer, String> elem = animals.lastEntry();
        System.out.println(elem); //вывод последнего элемента
        NavigableMap navigableMap = new TreeMap();
        navigableMap.put(0, "lion");
        navigableMap.put(1, "tiger");
        navigableMap.put(2, "cat");
        navigableMap.put(34, "puppy");
        navigableMap.put(56, "bear");
        Map.Entry<Integer, String> ceilingEntry = navigableMap.ceilingEntry(17); //возвращает значение ключ которого больше или равен указанному, но является самым маленьким из последующих
        Map.Entry<Integer, String> floorEntry = navigableMap.floorEntry(17); //возвращает наибльший ключ, который меньше или равен указанному значению
        Map.Entry<Integer, String> higherEntry = navigableMap.higherEntry(17); //возвращает значение ключ которого больше, но является самым маленьким из последующих
        Map.Entry<Integer, String> lowerEntry = navigableMap.lowerEntry(17); //возвращает наибльший ключ, который меньше указанному значению
        Map.Entry<Integer, String> firstEntry = navigableMap.firstEntry(); //выведет 1 элемент
        Map.Entry<Integer, String> lastEntry = navigableMap.lastEntry(); //выведет последний элемент
        System.out.println(higherEntry);

        }
    }

