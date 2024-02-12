package streams;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Pr12 {
    public static void main(String[] args) {
      //  ArrayList<String> arrayList = new ArrayList<>();
      //  Collections.addAll(arrayList, "HHHH", "GGG");
       // Map<String, String> newMap = arrayList.stream()
           //     .collect(Collectors.toMap())
        //группировка
        ArrayList<Phone> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, new Phone("S22", 56000, "Samsung"), new Phone("C67", 20000, "Realme"), new Phone("C53", 14000, "Realme"));
        Map<String, List<Phone>> newMap = arrayList.stream()
                .collect(Collectors.groupingBy(Phone::getDeveloper)); //данный метод группируем по какому-либо признаку
        for(Map.Entry<String, List<Phone>> el: newMap.entrySet()){ //благодаря этому мап перебираем элементы
            System.out.println(el.getKey());
            for (Phone phone:el.getValue()){
                System.out.println(phone.getName());
            }
        }

    }
}
