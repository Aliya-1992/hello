package streams;

import java.util.stream.Stream;

public class Pr5 {
    public static void main(String[] args) {
        // метод takewhile будет вытаскивать элементы из потока которые удовляетворяют определенным условиям. как только это условие прекращает свое выполнение
       // Stream<Integer> stream =Stream.of(34, 55, 55, 55, 998, 567, 89, 77, 55);
        //stream
               // .sorted()
               // .takeWhile(e-> e<100) //обращаясь к стриму метод берет элементы до тех пор пока они удовлетворяют условию я беру то тех пор пока беру условие

       // .dropWhile(e-> e<100)  //берет элементы не берет в рачет те элементы, которое соответствует условиям, до тех пор пока не встертится элемент который не соответствует условиям
             //   .forEach(e-> System.out.println(e)); //метод прекращает работу тогда, когда найдены все методы, удовлетворяющие условиям. .
    Stream<Integer> nums1 = Stream.of(12, 24,44, 44, 554);
    Stream<Integer> nums2 = Stream.of(-90, -44, -900);
    Stream.concat(nums1, nums2) //метод позволяет объеднить
            .filter(e-> e >-20 && e<100)
            .sorted()
            .distinct() //метод позволяет вернуть только уникальные данные в виде потока
            //.takeWhile(e->e <35)
            .forEach(e-> System.out.println(e));



    }
    }

