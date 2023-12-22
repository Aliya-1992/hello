package collections;

import java.util.ArrayList;

public class ProgramArrayList {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList();
        animals.add("kot");
        animals.add("lev");
        System.out.println(animals.get(0)); //получаем элемет с таким индексом
        animals.add(0, "tigr");
        System.out.println(animals.get(0));
        animals.remove(1);
        for(String animal: animals){
            System.out.println(animal);
        }
        Object[] animalToArray = animals.toArray();
        for (Object animal:animalToArray){
            System.out.println(animal);
        }


    }
}
