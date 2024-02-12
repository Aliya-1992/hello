package streams;
import java.util.stream.IntStream;

public class Program1 {
  public static void main(String[] args) {
        /*  int numbers[] = new int[]{1, 45, 55, 55, 67};
        int i=0;
        for (int j = 0; j<numbers.length; j++){
            if (numbers[j] >10){
                i++;
            }
            System.out.println(i);
        }
    }*/
    long i = IntStream.of(1, 45, 55, 55, 67) //с помощью оф указали данные с которыми хотим поработать
            .filter(w -> w>10) //фильтр-альтерна if промежуточная операция
            .count(); //возвращает конкретное значение того сколько у меня таких чисел интстреам возвращает лонг
      System.out.println(i);
}}
