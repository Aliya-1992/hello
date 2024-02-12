package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Pr11 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "HHHH", "GGG");
        List<String> newArrayList = arrayList.stream()
        //arrayList.stream()
                .sorted()
                .filter(e-> e.length()>3)
                .collect(Collectors.toList()); //собирает полученные значение и приводит к типу лист


        for (String el: newArrayList){
            System.out.println(el);
            Set<String> newSet=arrayList.stream()
                    //sorted()
                    .filter(e->e.length()>3)
                    .collect(Collectors.toSet());
            for (String e: newSet){
                System.out.println(e);
        }


    }
}}
