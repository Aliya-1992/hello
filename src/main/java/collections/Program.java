package collections;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList();
        collection.add("lev");
        collection.add("enot");
        System.out.println(collection);
        collection.remove("lev");
        System.out.println(collection.size()); //вывод размера
        Collection<String> collection1 = new ArrayList();
        collection1.addAll(collection); //копирование всех элементов
        collection1.clear(); //очистка всех элементов
        collection.contains("ggg"); //возвращает тру или фалс в зависимости от того, есть ли элемент в коллекции
        collection1.isEmpty(); //возвращает тру или фалс в зависимости от того, пустая коллекция или нет
        Collection <Integer> firstCollection = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Collection<Integer> secondCollection = new ArrayList<>(Arrays.asList(11, 2, 33, 44));
        firstCollection.removeAll(secondCollection); //удаляет все элементы первой коллекции, которые совпадают по значению с элементами воторой
        firstCollection.retainAll(secondCollection); //удаляет все элементы первой коллекции, которые не совпадают по значению с элементами воторой

    }
}
