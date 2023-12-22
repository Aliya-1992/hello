package HomeTask2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;


public class Task6 {
   public static void main(String[] args) {
      // String[][] nums1 = {{"toy", "122", "34"}, {"banana", "230", "45"}, {"water", "78", "45"}};
       System.out.println("Пожалуйста, укажите желаемое действие: 1. Добавить элемент 2. Удалить элемент 3. Вывести все элементы");
       Scanner sc = new Scanner(System.in);
       int numberOfAction = sc.nextInt();
       Deque<String> deque = new ArrayDeque();
       String[] nums1 = {"toy", "122", "34"};
       deque.add(Arrays.toString(nums1));
       String[] nums2 = {"banana", "230", "45"};
       deque.add(Arrays.toString(nums2));
       String[] nums3 = {"water", "78", "45"};
       deque.add(Arrays.toString(nums3));
       System.out.println(deque);
      switch (numberOfAction){
           case 1:
               Scanner s = new Scanner(System.in);
               System.out.println("Укажите название товара: ");
               String nameOfGoods = s.nextLine();
               System.out.println("Укажите cтоимость товара: ");
               String priceOFGoods = s.nextLine();
               System.out.println("Укажите количество товара: ");
               String quantityOfGoods = s.nextLine();
               String[] nums4 = new String[3];
               nums4[0] = nameOfGoods;
               nums4[1]=priceOFGoods;
               nums4[2] = quantityOfGoods;
               deque.add(Arrays.toString(nums4));
               System.out.println(deque);
               System.out.println("Новая позиция добавлена");

               break;
          case 2:
              Scanner re = new Scanner(System.in);
              System.out.println("Укажите название товара, котрый требуется удалить: ");
              String nameOfGoods1 = re.nextLine();
          case 3:















       }

   }}

