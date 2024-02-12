package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

public class Pr7 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        //Collections.addAll(arrayList, 1, 34, 45, 45, 432);
        Optional <Integer>min = arrayList.stream()
                .min(Integer::compare);//возвращает минимальное значение
                //.max(Integer::compare);
        //System.out.println(min);
       // int num1 = 12;
       // num1+=min.get();
        //System.out.println(num1);
       // System.out.println(min.get());

        Optional <Integer>max = arrayList.stream()
                .max(Integer::compare);
       // if (max.isPresent()){
      //      System.out.println(max.get());
       // }
       // else{
            //System.out.println("-");
       // }
        System.out.println(max.orElse(10));
        System.out.println(min.orElse(3)); //используется если нет списка орелс



    }
}
